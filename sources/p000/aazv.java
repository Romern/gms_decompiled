package p000;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: aazv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazv implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ aazy f56907a;

    public aazv(aazy aazy) {
        this.f56907a = aazy;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        abaa abaa;
        String str2;
        Cursor a;
        this.f56907a.mo31961a(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
        aazy aazy = this.f56907a;
        abab abab = aazy.f56915e;
        bzpb bzpb = aazy.f56914d;
        int a2 = bzpa.m126002a(bzpb.f170894b);
        Boolean bool = null;
        if (a2 != 0 && a2 == 2) {
            if (!z) {
                str = "0";
            } else {
                str = "1";
            }
            if (!TextUtils.isEmpty(bzpb.f170895c) && !TextUtils.isEmpty(str) && (a = abab.mo31962a(new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(bzpb.f170895c).appendQueryParameter("new_setting_value", str).build())) != null) {
                try {
                    a.moveToPosition(0);
                    abaa = new abaa();
                    abaa.f56921a = a.getString(0);
                    a.getString(1);
                    a.getString(2);
                    a.getString(3);
                } catch (Exception e) {
                }
                if (!(abaa == null || (str2 = abaa.f56921a) == null)) {
                    bool = abab.m47339a(str2);
                }
            }
            abaa = null;
            bool = abab.m47339a(str2);
        }
        if (bool == null || bool.booleanValue() != z) {
            compoundButton.setChecked(!z);
        }
    }
}
