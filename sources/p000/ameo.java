package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: ameo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ameo {

    /* renamed from: a */
    final /* synthetic */ ames f74831a;

    public ameo(ames ames) {
        this.f74831a = ames;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo41157a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo41158a(Object obj);

    /* renamed from: a */
    public final void mo41159a(long j, Object obj, almm almm) {
        ContentValues a = this.f74831a.mo41165a();
        a.clear();
        mo41164b(a, obj);
        if (a.size() > 0) {
            this.f74831a.f74836c.mo40740a("ac_item", a, "container_id = ? AND item_type = ? AND value = ?", new String[]{Long.toString(j), Integer.toString(mo41157a()), mo41158a(obj)});
            mo41163b(almm);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41161a(almm almm);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41162a(ContentValues contentValues, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo41163b(almm almm);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo41164b(ContentValues contentValues, Object obj);

    /* renamed from: a */
    public final void mo41160a(long j, Object obj, amdq amdq, almm almm) {
        ContentValues a = this.f74831a.mo41165a();
        a.clear();
        a.put("container_id", Long.valueOf(j));
        a.put("item_type", Integer.valueOf(mo41157a()));
        a.put("is_edge_key", Boolean.valueOf(amdx.m62701c(amdq.mo41128a(obj))));
        mo41162a(a, obj);
        if (!TextUtils.isEmpty(a.getAsString("value"))) {
            this.f74831a.f74836c.mo40742a("ac_item", a);
            mo41161a(almm);
        }
    }
}
