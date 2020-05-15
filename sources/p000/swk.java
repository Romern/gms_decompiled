package p000;

import com.google.android.gms.config.ConfigChimeraService;
import java.util.List;
import java.util.Map;

/* renamed from: swk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swk {

    /* renamed from: a */
    public final Map f45284a;

    /* renamed from: b */
    public final byte[] f45285b;

    /* renamed from: c */
    public final byte[] f45286c;

    /* renamed from: d */
    public final List f45287d;

    /* renamed from: e */
    public final List f45288e;

    public swk(List list, List list2, Map map, byte[] bArr, byte[] bArr2) {
        this.f45287d = list;
        this.f45288e = list2;
        this.f45284a = map;
        this.f45285b = bArr;
        this.f45286c = bArr2;
    }

    /* renamed from: a */
    public final long mo26199a(int i) {
        List list = this.f45287d;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((Long) this.f45287d.get(i > this.f45287d.size() ? this.f45287d.size() - 1 : i - 1)).longValue();
    }

    /* renamed from: b */
    public final long mo26201b(int i) {
        List list = this.f45288e;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((Long) this.f45288e.get(i > this.f45288e.size() ? this.f45288e.size() - 1 : i - 1)).longValue();
    }

    /* renamed from: c */
    public final boolean mo26203c() {
        List list = this.f45287d;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = this.f45288e;
        return list2 != null && !list2.isEmpty();
    }

    /* renamed from: a */
    public final String mo26200a() {
        return ConfigChimeraService.m22756a(this.f45288e);
    }

    /* renamed from: b */
    public final String mo26202b() {
        return ConfigChimeraService.m22757a(this.f45284a);
    }
}
