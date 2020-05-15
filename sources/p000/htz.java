package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSettingsChimeraActivity;
import java.util.List;

/* renamed from: htz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class htz extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ CredentialsSettingsChimeraActivity f20425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public htz(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, Context context, List list) {
        super(context, (int) C0126R.C0128layout.credentials_app_item, list);
        this.f20425a = credentialsSettingsChimeraActivity;
    }

    public final boolean areAllItemsEnabled() {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f20425a.getLayoutInflater().inflate((int) C0126R.C0128layout.credentials_app_item, viewGroup, false);
        }
        String str = (String) getItem(i);
        if (str != null) {
            CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.f20425a;
            int i2 = CredentialsSettingsChimeraActivity.f10180j;
            credentialsSettingsChimeraActivity.mo7442a(view, str);
        }
        return view;
    }

    public final boolean isEnabled(int i) {
        return true;
    }
}
