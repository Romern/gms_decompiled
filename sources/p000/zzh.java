package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zzh implements zyl {

    /* renamed from: a */
    public final Context f56262a;

    /* renamed from: b */
    public final zxw f56263b;

    /* renamed from: c */
    final /* synthetic */ zzi f56264c;

    /* renamed from: d */
    private final List f56265d = new ArrayList();

    /* renamed from: e */
    private bqgg f56266e;

    public zzh(zzi zzi, Context context, zxw zxw) {
        this.f56264c = zzi;
        this.f56262a = context.getApplicationContext();
        this.f56263b = zxw;
    }

    /* renamed from: a */
    public final bqgg mo31598a() {
        zyw zyw;
        bqgy bqgy;
        bqgy c = bqgy.m112818c();
        zzi zzi = this.f56264c;
        synchronized (zzi.f56268b) {
            zyw = zzi.f56284r;
        }
        if (zyw == null) {
            zxf a = zzd.m46727a();
            String a2 = zyb.m46670a(a);
            synchronized (this.f56264c.f56268b) {
                if (this.f56266e == null) {
                    zyh.m46683c("FontsSharedState", "Attempting to fetch directory from %s", a2);
                    zxw zxw = this.f56263b;
                    if (((zya) zxw).f56163g) {
                        bqgy = ((zya) zxw).mo31583b(a2, a).f56149d;
                    } else {
                        bqgy = bqgy.m112818c();
                        bqgy.mo69138b(zya.f56162f);
                    }
                    this.f56266e = bqgy;
                } else {
                    zyh.m46683c("FontsSharedState", "Adding subscriber to pending download", new Object[0]);
                }
                this.f56265d.add(c);
                if (this.f56265d.size() > 1) {
                    return c;
                }
                bqgg bqgg = this.f56266e;
                bqgg.mo741a(new zzg(this, bqgg, a2, a), this.f56264c.mo31624b());
                return c;
            }
        }
        c.mo69138b(zyw);
        return c;
    }

    /* renamed from: a */
    public final void mo31620a(String str, zxf zxf) {
        ArrayList arrayList;
        this.f56263b.mo31578a(str, zxf.f56087b);
        synchronized (this.f56264c.f56268b) {
            arrayList = new ArrayList(this.f56265d);
            this.f56265d.clear();
            this.f56266e = null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bqgy) arrayList.get(i)).mo69138b((Object) null);
        }
    }
}
