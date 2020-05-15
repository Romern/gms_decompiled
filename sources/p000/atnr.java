package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnr */
public final /* synthetic */ class atnr implements View.OnClickListener {

    /* renamed from: a */
    private final TapUiChimeraActivity f90567a;

    public atnr(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90567a = tapUiChimeraActivity;
    }

    public void onClick(View view) {
        Bitmap bitmap;
        TapUiChimeraActivity tapUiChimeraActivity = this.f90567a;
        Intent intent = new Intent("com.google.commerce.tapandpay.android.survey.SHOW_SURVEY");
        if (!atxn.m76506a(tapUiChimeraActivity, intent)) {
            wwr a = wvu.m42361a(tapUiChimeraActivity);
            tapUiChimeraActivity.f108724q.setDrawingCacheEnabled(true);
            if (tapUiChimeraActivity.f108724q.getDrawingCache() != null) {
                bitmap = Bitmap.createBitmap(tapUiChimeraActivity.f108724q.getDrawingCache());
            } else {
                bitmap = null;
            }
            tapUiChimeraActivity.f108724q.setDrawingCacheEnabled(false);
            wwu wwu = new wwu();
            wwu.f51496a = tapUiChimeraActivity.f108732y.f108326b;
            wwu.mo29491a(bitmap);
            a.mo29487a(wwu.mo29490a());
            return;
        }
        tapUiChimeraActivity.startActivity(intent);
        tapUiChimeraActivity.finish();
    }
}
