

import static org.junit.Assert.*;

/**
 * Created by Karan on 31-01-2017.
 */
public class MainActivityTest {
    public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
            display(1);
        }

        /**
         * This method displays the given quantity value on the screen.
         */
        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(
                    R.id.quantity_text_view);
            quantityTextView.setText("" + number);
        }


    }

}