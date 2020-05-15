package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreviewScreenshotChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) C0126R.C0128layout.preview_ui);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.gf_screenshot_view);
        Bitmap bitmap = FeedbackChimeraActivity.f31575f;
        if (bitmap != null) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int[] iArr = {point.x, point.y};
            int width = (int) (((float) bitmap.getWidth()) * 1.5f);
            int height = (int) (((float) bitmap.getHeight()) * 1.5f);
            if (width < iArr[0] && height < iArr[1]) {
                bitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        finish();
    }
}
