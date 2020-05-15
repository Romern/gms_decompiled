package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.TimeUnit;

/* renamed from: aexj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexj extends aesv {

    /* renamed from: a */
    public static final long f63980a;

    /* renamed from: c */
    private static final String[] f63981c = cfaz.m138554c().split(",");

    /* renamed from: b */
    public boolean f63982b;

    /* renamed from: d */
    private String f63983d;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        String[] strArr = f63981c;
        f63980a = timeUnit.toMillis(Long.parseLong(strArr[strArr.length - 1]));
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1 && this.f63982b) {
            Context b = mo34528b();
            String str = this.f63983d;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(b).edit();
            String valueOf = String.valueOf(str);
            edit.putBoolean(valueOf.length() == 0 ? new String("link_sharing_pref:") : "link_sharing_pref:".concat(valueOf), true);
            edit.apply();
        }
        super.onClick(dialogInterface, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f63983d = getArguments().getString("account_name");
        return mo9306a().setView(LayoutInflater.from(mo34528b()).inflate((int) C0126R.C0128layout.location_sharing_checkbox, (ViewGroup) null, false)).create();
    }

    public final void onResume() {
        super.onResume();
        if (getDialog() != null) {
            AlertDialog alertDialog = (AlertDialog) getDialog();
            CheckBox checkBox = (CheckBox) alertDialog.findViewById(C0126R.C0129id.remember_checkbox);
            checkBox.setOnCheckedChangeListener(new aexi(this, alertDialog));
            int i = getArguments().getInt("accent_color");
            if (i != -2) {
                alertDialog.getButton(-1).setTextColor(i);
                alertDialog.getButton(-2).setTextColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{i, mo34528b().getResources().getColor(C0126R.color.location_sharing_disabled_button)}));
                Resources resources = checkBox.getContext().getResources();
                int i2 = Build.VERSION.SDK_INT;
                checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{i, resources.getColor(C0126R.color.material_grey_600)}));
            }
        }
    }
}
