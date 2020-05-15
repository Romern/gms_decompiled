package p000;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: anni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anni extends ClickableSpan {

    /* renamed from: a */
    private final String f77197a;

    public anni(String str) {
        this.f77197a = str;
    }

    public void onClick(View view) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.f77197a));
        List<ResolveInfo> queryIntentActivities = view.getContext().getPackageManager().queryIntentActivities(data, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        int size = queryIntentActivities.size();
        int i = 0;
        while (i < size) {
            String str = queryIntentActivities.get(i).activityInfo.packageName;
            if ("com.google.android.apps.plus".equals(str)) {
                i++;
            } else {
                data.setPackage(str);
                view.getContext().startActivity(data);
                return;
            }
        }
    }
}
