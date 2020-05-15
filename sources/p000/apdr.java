package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: apdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdr {

    /* renamed from: d */
    public static final aoyh f84185d = aoyh.m69805a("CRSModel");

    /* renamed from: a */
    public final SharedPreferences f84186a;

    /* renamed from: b */
    public String f84187b;

    /* renamed from: c */
    public final Map f84188c = new HashMap();

    /* renamed from: e */
    private final Set f84189e;

    public apdr(SharedPreferences sharedPreferences, Set set) {
        this.f84186a = sharedPreferences;
        this.f84189e = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final apej mo47125a(BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity) {
        if (backedUpContactsPerDeviceEntity.mo58802c() == null) {
            return null;
        }
        apei apei = new apei(backedUpContactsPerDeviceEntity.f107230a, backedUpContactsPerDeviceEntity.f107232c);
        if (cgkf.m145856c()) {
            apei.f84219b = backedUpContactsPerDeviceEntity.f107231b;
        }
        apei.f84228k = null;
        for (SourceStats sourceStats : backedUpContactsPerDeviceEntity.mo58802c()) {
            if (cgjy.m145755b()) {
                if (!this.f84189e.contains(sourceStats.mo58831a()) || TextUtils.equals("com.google", sourceStats.mo58831a())) {
                    apei.mo47136a(sourceStats);
                }
            } else if (!ayts.m84809a(sourceStats.mo58831a()) || TextUtils.equals("com.google", sourceStats.mo58831a())) {
                apei.mo47136a(sourceStats);
            }
        }
        apei.f84221d = backedUpContactsPerDeviceEntity.f107233d.longValue();
        if (!cgkf.m145858e()) {
            apei.f84222e = backedUpContactsPerDeviceEntity.f107234e.longValue();
        }
        return apei.mo47135a();
    }

    /* renamed from: b */
    public final Map mo47127b(String str) {
        return (Map) this.f84188c.get(str);
    }

    /* renamed from: a */
    public final void mo47126a(String str) {
        if (str == null || apel.m70101a(str)) {
            this.f84187b = str;
        }
    }
}
