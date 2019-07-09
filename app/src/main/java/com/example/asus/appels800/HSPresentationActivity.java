package com.example.asus.appels800;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class HSPresentationActivity extends AppCompatActivity {


    SliderLayout sliderLayout;
    String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hspresentation);

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.SWAP); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(3); //set scroll delay in seconds :


        setSliderViews();
    }

    private void setSliderViews() {

        for (int i = 0; i <= 9; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(getApplicationContext());


            switch (i) {
                case 0:
                    sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY);

                    sliderView.setImageDrawable(R.drawable.pic12);
                    description="";
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.pic2);
                    description="";
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.pic3);
                    description="Vue aérienne";
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.pic4);
                    description="";
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.pic5);
                    description="Habit traditionnel hammamien";
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.pic6);
                    description="Hotel de la ville";
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.pic7);
                    description="Marina el Kantaoui";
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.pic8);
                    description="Ecole supérieure des science et de technologie";
                    break;
                case 8:
                    sliderView.setImageDrawable(R.drawable.pic10);
                    description="Marina";
                    break;
                case 9:
                    sliderView.setImageDrawable(R.drawable.boulailahouar);
                    description="Stade Bouali Lahouar";
                    break;

            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderView.setDescription(description);
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    // Toast.makeText(GalleryActivity.this, "" + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }
    }
}
