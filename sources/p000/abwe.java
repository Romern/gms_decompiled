package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: abwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwe extends abxm implements abwl {

    /* renamed from: a */
    public final abxd f58614a;

    /* renamed from: b */
    final /* synthetic */ briw f58615b;

    /* renamed from: c */
    private final Context f58616c;

    /* renamed from: d */
    private final abvo f58617d;

    /* renamed from: e */
    private final abvx f58618e;

    /* renamed from: f */
    private final abxt f58619f;

    /* renamed from: g */
    private final rnt f58620g;

    /* renamed from: h */
    private abwn f58621h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abwe(briw briw, Context context, abwu abwu, rnt rnt, MutateRequest mutateRequest, abvo abvo, abvx abvx, abxt abxt) {
        super(briw.f142887c, abwu, briw.f142886b, briw.f142888d);
        boolean z;
        abxd abxd;
        this.f58615b = briw;
        if (abvo != null) {
            z = true;
        } else if (abvx == null) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34974b(z);
        this.f58616c = context;
        int i = mutateRequest.f152362a;
        if (i == 1) {
            abxd = new abxk(mutateRequest.f152363b);
        } else if (i == 2) {
            abxd = new abxe(mutateRequest.f152363b);
        } else if (i == 3) {
            abxd = new abxg(mutateRequest.f152364c);
        } else if (i == 4) {
            abxd = new abxf();
        } else if (i == 6) {
            abxd = new abxh(mutateRequest.f152365d);
        } else if (i == 7) {
            abxd = new abxj(mutateRequest.f152366e, mutateRequest.f152367f, mutateRequest.f152368g);
        } else {
            throw new IllegalArgumentException();
        }
        this.f58614a = abxd;
        this.f58617d = abvo;
        this.f58618e = abvx;
        this.f58619f = abxt;
        this.f58620g = rnt;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo32376a() {
        if (this.f58618e != null) {
            String str = this.f58615b.f142889e;
            if ("*".equals(cemz.m137438d()) || sqc.m35963b(cemz.m137438d().split(","), str)) {
                abrv b = this.f58615b.f142885a.mo33016b();
                this.f58614a.mo32406a(this.f58615b.f142890f, b, this.f58619f);
                this.f58614a.mo32405a(b, this.f58615b.f142890f, this.f58618e);
                return null;
            }
        }
        this.f58615b.mo69579a(this.f58617d, this.f58619f);
        abrv b2 = this.f58615b.f142885a.mo33016b();
        this.f58614a.mo32406a(this.f58615b.f142890f, b2, this.f58619f);
        this.f58614a.mo32401a(this.f58615b.f142890f, b2);
        SQLiteDatabase writableDatabase = this.f58617d.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int a = this.f58614a.mo32399a();
            if (a > 0) {
                this.f58617d.mo32360a(writableDatabase, this.f58615b.f142890f, b2, this.f58619f, a);
            }
            this.f58614a.mo32403a(this.f58616c, writableDatabase, this.f58617d, this.f58615b.f142890f, this.f58619f);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            this.f58614a.mo32400a(this.f58617d, this.f58615b.f142890f, b2);
            return null;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo32380a(abwn abwn) {
        this.f58621h = abwn;
        mo32410b();
        this.f58621h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32377a(Status status, Object obj) {
        Void voidR = (Void) obj;
        this.f58620g.mo11797a(status);
    }

    /* renamed from: a */
    public final void mo32381a(String str, bpzq bpzq) {
        super.mo32382a(str, bpzq, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32382a(String str, bpzq bpzq, Object obj) {
        Void voidR = (Void) obj;
        if (!rjs.m33678d(abxr.m48488a(bpzq)) || !this.f58621h.mo32385b()) {
            this.f58621h.mo32384a();
            super.mo32382a(str, bpzq, voidR);
        }
    }
}
