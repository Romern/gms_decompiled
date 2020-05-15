package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: abfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfh extends aayk {
    public abfh(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        super(context, helpConfig, bqgj, abcr, 14);
    }

    /* renamed from: a */
    public static abeg m47611a(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        abfh abfh = new abfh(context, helpConfig, bqgj, abcr);
        try {
            aays k = abfh.mo31910k();
            if (!abfh.mo31909a(k)) {
                return null;
            }
            try {
                return (abeg) bxvk.m124016a(abeg.f57189e, k.f56844c, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_ConfigsCronetRequest", "Parsing GetConfigurationsResponse failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_ConfigsCronetRequest", "Fetching configurations failed.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78946N()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79051c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        String str;
        if (ceiq.m136944b() && !TextUtils.isEmpty(this.f56831d.f78812L)) {
            str = this.f56831d.f78812L;
        } else {
            str = this.f56831d.f78827b;
        }
        bxvd da = abem.f57255c.mo74144da();
        for (aars aars : aars.m46806b().values()) {
            if (!aars.equals(aars.f56378b)) {
                if (aars.equals(aars.f56380d)) {
                    String str2 = aars.f56380d.f56397u.f57183b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str);
                    da.mo73971a(aatb.m46959a(sb.toString()));
                } else {
                    abee abee = aars.f56397u;
                    if (abee.f57184c != -1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abem abem = (abem) da.f164949b;
                        abee.getClass();
                        if (!abem.f57258b.mo73666a()) {
                            abem.f57258b = bxvk.m124021a(abem.f57258b);
                        }
                        abem.f57258b.add(abee);
                    } else {
                        da.mo73971a(abee);
                    }
                }
            }
        }
        aash.f56447l = (abem) da.mo74062i();
    }
}
