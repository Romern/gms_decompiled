package p000;

import android.content.Context;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;

/* renamed from: sdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdy {

    /* renamed from: a */
    private final Resources f44081a;

    /* renamed from: b */
    private final String f44082b;

    public sdy(Context context) {
        sdo.m34959a(context);
        Resources resources = context.getResources();
        this.f44081a = resources;
        this.f44082b = resources.getResourcePackageName(C0126R.string.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public final String mo25405a(String str) {
        int identifier = this.f44081a.getIdentifier(str, "string", this.f44082b);
        if (identifier != 0) {
            return this.f44081a.getString(identifier);
        }
        return null;
    }
}
