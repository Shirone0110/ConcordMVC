package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import views.MainController;

public class UserViewTransitionModel implements UserViewTransitionModelInterface
{
	
	SplitPane mainView;
	ConcordModel model;
	
	public UserViewTransitionModel(BorderPane view, ConcordModel m)
	{
		mainView = view;
		model = m;
		
	}

	@Override
	public void showUser()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class
				.getResource("../views/UserInfoView.fxml"));
		try
		{
			VBox view = loader.load();
			//TODO yo mama
			//mainView.setLayoutX(view);
			MainController cont = loader.getController();
			cont.setModel(model);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

	@Override
	public void showBlock()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class
				.getResource("../views/BlockList.fxml"));
		try
		{
			VBox view = loader.load();
			mainView.setCenter(view);
			MainController cont = loader.getController();
			cont.setModel(model);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
