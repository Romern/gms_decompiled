package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.Closeable;
import java.util.Collection;
import java.util.Map;

/* renamed from: ajbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajbs implements Closeable, aixa {

    /* renamed from: a */
    public final C1231nx f70343a;

    /* renamed from: b */
    public final aiyr f70344b;

    /* renamed from: c */
    public final Context f70345c;

    /* renamed from: d */
    public final ClientAppIdentifier f70346d;

    /* renamed from: e */
    public ajaj f70347e;

    /* renamed from: f */
    public String f70348f;

    /* renamed from: g */
    public final ajbk f70349g;

    /* renamed from: h */
    private final ajai f70350h;

    public ajbs(Context context, ClientAppIdentifier clientAppIdentifier, ajbk ajbk) {
        ajai ajai = (ajai) ahgz.m55754a(context, ajai.class);
        this.f70345c = context;
        this.f70346d = clientAppIdentifier;
        this.f70349g = ajbk;
        this.f70350h = ajai;
        this.f70344b = (aiyr) ahgz.m55754a(context, aiyr.class);
        byyl byyl = ((ajat) ahgz.m55754a(context, ajat.class)).f70278f.f168921d;
        this.f70343a = new ajbp(this, (byyl == null ? byyl.f168949v : byyl).f168968s);
        ajai.mo38387a(new ajbq(this));
    }

    /* renamed from: a */
    public final Collection mo38457a() {
        return mo38459b().values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo38459b() {
        return this.f70343a.mo15553b();
    }

    public final void close() {
        ajaj ajaj = this.f70347e;
        if (ajaj != null) {
            ajaj.mo36464b();
            this.f70347e = null;
        }
    }

    /* renamed from: a */
    public final void mo38195a(int i) {
        if (i >= 80) {
            srn srn = ahfq.f67120a;
            this.f70343a.mo15548a();
        }
    }

    /* renamed from: a */
    public final boolean mo38458a(byzr byzr) {
        if (byzr.f169155d.size() > 0 || byzr.f169156e.size() > 0) {
            ajai ajai = this.f70350h;
            bxwc bxwc = byzr.f169155d;
            bxwc bxwc2 = byzr.f169156e;
            ajai.f70251l.mo72984b();
            int size = bxwc.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    i++;
                    if (ajai.f70247h.containsKey((byys) bxwc.get(i))) {
                        break;
                    }
                } else {
                    loop1:
                    for (ajag ajag : ajai.f70246g.values()) {
                        int size2 = bxwc2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                i2++;
                                if (ajag.f70234d.containsKey((String) bxwc2.get(i2))) {
                                    break loop1;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
