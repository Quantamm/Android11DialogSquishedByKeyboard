package com.jeremyfiggins.android11keyboardsquishedbykeyboard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.dialog_content, null);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(getLoremIpsum());
        builder.setView(view);
        builder.create().show();
    }

    private String getLoremIpsum() {
        return " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean varius risus nec mauris ultrices, ac venenatis ligula elementum. Fusce eget elit fringilla, accumsan lectus sed, suscipit nibh. Nunc rutrum arcu lacus, sit amet consequat lorem dictum non. Vestibulum condimentum non felis et finibus. In quis molestie ante, sed aliquet nunc. Integer ut mauris urna. Maecenas semper tristique semper. Morbi tempus ultrices ligula, ac elementum velit. Aliquam molestie ligula nec maximus consectetur.\n" +
                "\n" +
                "Mauris id eros quis justo vestibulum auctor. In hac habitasse platea dictumst. Cras lacinia purus tristique nisi blandit accumsan. Etiam in ultrices erat. Proin sapien libero, iaculis sed arcu eu, sodales congue nisi. Ut vitae turpis eu purus elementum consectetur. Pellentesque quam enim, fermentum eu massa ut, blandit eleifend ante. Duis semper dolor non suscipit sollicitudin. Aenean iaculis lacus nec augue interdum elementum. Suspendisse nec mattis tortor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Suspendisse nunc nulla, finibus sed egestas in, interdum vulputate sapien. ";
    }
}