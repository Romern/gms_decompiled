package p000;

import com.google.android.gms.drive.internal.model.File;

/* renamed from: uxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uxr extends uxv {
    public uxr(uvy uvy) {
        super(uvy, true, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        uml aa = ujx.mo27565aa();
        boolean z = true;
        if (!aa.mo27696b() && !aa.mo27697c()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        Boolean bool = (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        ujx.mo27560a(!((Boolean) obj).booleanValue() ? uml.UNPINNED : uml.PINNED_ACTIVE);
    }
}
