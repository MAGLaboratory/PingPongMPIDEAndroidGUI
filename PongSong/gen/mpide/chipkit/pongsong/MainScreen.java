package mpide.chipkit.pongsong;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.VerticalSeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainScreen extends Activity implements OnSeekBarChangeListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);
		
		sb = (VerticalSeekBar)findViewById(R.id.testBar0);
		sb.setOnSeekBarChangeListener(this);
		
		sbVal = (TextView)findViewById(R.id.testVal0);
	}
	@Override
	public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUsr){
		sbVal.setText(""+progress);
	}	
	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		sb.setSecondaryProgress(sb.getProgress());
		
	}
	private VerticalSeekBar sb;
	private TextView sbVal;
}
