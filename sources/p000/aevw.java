package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: aevw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevw extends aevz {
    public aevw(ResolveInfo resolveInfo, aevy aevy) {
        super(resolveInfo, aevy);
    }

    /* renamed from: a */
    public final void mo34615a(Context context, TextView textView, ImageView imageView) {
        PackageManager packageManager = context.getPackageManager();
        textView.setText(((ResolveInfo) this.f63929d).loadLabel(packageManager));
        imageView.setImageDrawable(((ResolveInfo) this.f63929d).loadIcon(packageManager));
    }
}
