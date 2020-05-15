package com.google.android.gms.backup.settings.p033ui;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.backup.settings.ui.AppPreference */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppPreference extends Preference {
    public AppPreference(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        ImageView imageView = (ImageView) aoq.mo2241c(16908294);
        int dimensionPixelSize = this.f1595k.getResources().getDimensionPixelSize(C0126R.dimen.drive_backup_app_icon_size);
        imageView.setMaxWidth(dimensionPixelSize);
        imageView.setMaxHeight(dimensionPixelSize);
    }
}
