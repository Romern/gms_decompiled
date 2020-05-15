package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: amqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqe extends aaab {

    /* renamed from: a */
    private final amvj f75736a;

    /* renamed from: b */
    private final alss f75737b;

    /* renamed from: c */
    private final int[] f75738c;

    public amqe(alss alss, Context context, int[] iArr) {
        super(208, "AddAccountCategoryToBackupAndSync");
        this.f75736a = amvj.m63368a(context);
        this.f75738c = iArr;
        this.f75737b = alss;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f75736a.mo41377a(this.f75738c);
        this.f75737b.mo40725b(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75737b.mo40725b(status);
    }
}
