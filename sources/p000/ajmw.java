package p000;

import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ajmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajmw {

    /* renamed from: a */
    private final Map f70942a = new C1223np();

    /* renamed from: b */
    private final Map f70943b = new C1223np();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ajmv mo38798a(akcd akcd) {
        ajmv ajmv;
        ajmv = (ajmv) this.f70943b.get(akcd);
        if (ajmv != null) {
            mo38803a(ajmv.f70940a);
        } else {
            ajmv = null;
        }
        return ajmv;
    }

    /* renamed from: b */
    public final synchronized akcd mo38804b(ShareTarget shareTarget) {
        String str = (String) this.f70942a.get(shareTarget);
        if (str == null) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Failed to fetch serviceId for %s", shareTarget);
            return null;
        }
        return mo38805b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo38807c(ShareTarget shareTarget) {
        String str = (String) this.f70942a.remove(shareTarget);
    }

    /* renamed from: a */
    public final synchronized bngx mo38799a() {
        return bngx.m109368a((Collection) this.f70943b.keySet());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized String mo38800a(ShareTarget shareTarget) {
        String str = (String) this.f70942a.get(shareTarget);
        if (!TextUtils.isEmpty(str)) {
            bnrd a = bnic.m109495a(this.f70943b.values()).iterator();
            while (a.hasNext()) {
                ajmv ajmv = (ajmv) a.next();
                if (str.equals(ajmv.f70940a)) {
                    return ajmv.f70941b;
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized akcd mo38805b(String str) {
        for (akcd akcd : this.f70943b.keySet()) {
            ajmv ajmv = (ajmv) this.f70943b.get(akcd);
            if (ajmv != null && str.equals(ajmv.f70940a)) {
                return akcd;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized bngx mo38806b() {
        bngs bngs;
        bngs = new bngs();
        for (Map.Entry entry : this.f70943b.entrySet()) {
            if (!"INTERNAL_PROVIDER_ID".equals(((ajmv) entry.getValue()).f70940a)) {
                bngs.mo67668c((akcd) entry.getKey());
            }
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public final synchronized void mo38801a(akcd akcd, ajmv ajmv) {
        this.f70943b.put(akcd, ajmv);
    }

    /* renamed from: a */
    public final synchronized void mo38802a(ShareTarget shareTarget, String str) {
        this.f70942a.put(shareTarget, str);
    }

    /* renamed from: a */
    public final synchronized void mo38803a(String str) {
        akcd b = mo38805b(str);
        if (b != null) {
            this.f70943b.remove(b);
            Iterator it = new C1225nr(this.f70942a.keySet()).iterator();
            while (it.hasNext()) {
                ShareTarget shareTarget = (ShareTarget) it.next();
                if (str.equals(this.f70942a.get(shareTarget))) {
                    this.f70942a.remove(shareTarget);
                }
            }
        }
    }
}
