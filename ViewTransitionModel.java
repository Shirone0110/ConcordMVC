package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import views.MainController;

public class ViewTransitionModel implements ViewTransitionModelInterface
{
	BorderPane mainView;
	ConcordModel model;
	
	public ViewTransitionModel(BorderPane view, ConcordModel m)
	{
		mainView = view;
		model = m;
	}

	@Override
	public void showServer()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class
				.getResource("../views/ServerView.fxml"));
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

	@Override
	public void showDc()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class
				.getResource("../views/DirectConversationView.fxml"));
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
