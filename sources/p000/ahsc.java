package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsc {

    /* renamed from: a */
    private String f67921a = null;

    /* renamed from: b */
    private final Context f67922b;

    /* renamed from: c */
    private final buta f67923c;

    /* renamed from: d */
    private buse f67924d;

    public ahsc(Context context) {
        this.f67922b = context;
        this.f67923c = new buta(context);
    }

    /* renamed from: a */
    private final buse m56452a() {
        buse buse = this.f67924d;
        if (buse != null) {
            return buse;
        }
        bqgy c = bqgy.m112818c();
        this.f67923c.mo73096a(new Intent("com.google.android.gms.fastpair.ACTION_BIND_LOC_WRAPPER").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsBoundBrokerService"), new ahsb(c), 200);
        try {
            return (buse) c.get(200, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("LocalizedStringWrapperUtil: get binder failed");
            return null;
        }
    }

    /* renamed from: b */
    private final String m56454b(String str, Object... objArr) {
        if (TextUtils.isEmpty(this.f67921a)) {
            ModuleManager.ModuleInfo c = sqq.m35994c(this.f67922b);
            this.f67921a = c == null ? this.f67922b.getPackageName() : c.moduleApk.apkPackageName;
        }
        int identifier = this.f67922b.getResources().getIdentifier(str, "string", this.f67921a);
        if (identifier != 0) {
            try {
                return this.f67922b.getString(identifier, objArr);
            } catch (Resources.NotFoundException e) {
                String format = String.format("String name:%s with id:%s is not existing in package:%s", str, Integer.valueOf(identifier), this.f67921a);
                int i = Build.VERSION.SDK_INT;
                throw new Resources.NotFoundException(format, e);
            }
        } else {
            String str2 = this.f67921a;
            StringBuilder sb = new StringBuilder(str.length() + 40 + String.valueOf(str2).length());
            sb.append("String name:");
            sb.append(str);
            sb.append(" is not existing in package:");
            sb.append(str2);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    /* renamed from: a */
    private final String m56453a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        buse a = m56452a();
        if (a != null) {
            try {
                Parcel bj = a.mo8529bj();
                bj.writeString(str);
                Parcel a2 = a.mo8526a(2, bj);
                String readString = a2.readString();
                a2.recycle();
                ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("LocalizedStringWrapperUtil: get string %s with result %s, spent time %d ms", str, readString, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                this.f67924d = a;
                return readString;
            } catch (RemoteException e) {
                if (this.f67924d != null) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("LocalizedStringWrapperUtil: RemoteException with cached iBinder, try to renew it.");
                    this.f67924d = null;
                    return m56453a(str);
                }
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68405a("LocalizedStringWrapperUtil: RemoteException");
                return null;
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("LocalizedStringWrapperUtil: binder is null");
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized String mo37009a(String str, Object... objArr) {
        if (cfoj.f184966a.mo6606a().mo82073X()) {
            sdo.m34973b("Only call getWrappedString on worker thread!");
            boolean startsWith = str.startsWith("fast_pair_");
            StringBuilder sb = new StringBuilder(str.length() + 74);
            sb.append("Inputted string name ");
            sb.append(str);
            sb.append(" is invalid. Please name it with 'fast_pair_' prefix!");
            sdo.m34975b(startsWith, sb.toString());
            String a = m56453a(str);
            if (TextUtils.isEmpty(a)) {
                return m56454b(str, objArr);
            } else if (objArr.length <= 0) {
                return a;
            } else {
                return String.format(burl.m120299d(), a, objArr);
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("LocalizedStringWrapper not enabled");
            return m56454b(str, objArr);
        }
    }
}
