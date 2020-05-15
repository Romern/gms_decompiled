package p000;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: abxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abxm {

    /* renamed from: a */
    private final abyp f58685a;

    /* renamed from: b */
    private final abwu f58686b;

    /* renamed from: c */
    private final abym f58687c;

    /* renamed from: d */
    private final abxp f58688d;

    public abxm(abyp abyp, abwu abwu, abym abym, abxp abxp) {
        this.f58685a = abyp;
        this.f58686b = abwu;
        this.f58687c = abym;
        this.f58688d = abxp;
    }

    /* renamed from: a */
    public final Pair mo32408a(abxq abxq) {
        String message = abxq.getMessage();
        if (message == null) {
            message = "(no message)";
        }
        bpzq bpzq = abxq.f58694a;
        try {
            Thing thing = abxq.f58695b;
            if (thing != null) {
                String str = thing.f152372d;
                StringBuilder sb = new StringBuilder(message.length() + 31 + String.valueOf(str).length());
                sb.append(message);
                sb.append(" The invalid indexable url is: ");
                sb.append(str);
                message = sb.toString();
            }
            try {
                briy.m114097a(String.format("Invalid Indexable detected: %s", message));
                abxp abxp = this.f58688d;
                abwu abwu = this.f58686b;
                abxp.mo32415a(abwu.f58652a, abwu.f58653b, bpzq, abxq.getMessage(), abxq.f58695b, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            this.f58685a.mo32456a("AppIndexingTask catch", e, cema.m137239f());
            return new Pair(message, bpzq);
        }
        return new Pair(message, bpzq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo32376a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32377a(Status status, Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[Catch:{ Exception -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095 A[Catch:{ Exception -> 0x00dd }] */
    /* renamed from: b */
    public final void mo32410b() {
        Object obj;
        String message;
        ActionImpl actionImpl;
        String a = this.f58686b.mo32392a();
        String str = this.f58686b.f58652a;
        bpzq bpzq = bpzq.NO_ERROR;
        absg.m48186a("Handling %s request from %s", a, str);
        Object obj2 = null;
        r7 = null;
        String str2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        try {
            obj = mo32376a();
            try {
                absg.m48186a("%s from %s finished successfully", a, str);
            } catch (abxq e) {
                e = e;
                obj2 = obj;
            } catch (abws e2) {
                e = e2;
                obj5 = obj;
                absg.m48200c(e, "%s from %s failed", a, str);
                message = e.getMessage();
                if (message == null) {
                }
                bpzq bpzq2 = e.f58647a;
                try {
                    actionImpl = e.f58649c;
                    if (actionImpl == null) {
                    }
                    try {
                        briy.m114097a(String.format("Invalid Action detected: %s", message));
                        abxp abxp = this.f58688d;
                        abwu abwu = this.f58686b;
                        abxp.mo32415a(abwu.f58652a, abwu.f58653b, bpzq2, e.getMessage(), null, e.f58649c);
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    this.f58685a.mo32456a("AppIndexingTask catch", e, cema.m137239f());
                    Pair pair = new Pair(message, bpzq2);
                    bpzq = (bpzq) pair.second;
                    obj = obj5;
                    str2 = (String) pair.first;
                    mo32382a(str2, bpzq, obj);
                }
                Pair pair2 = new Pair(message, bpzq2);
                bpzq = (bpzq) pair2.second;
                obj = obj5;
                str2 = (String) pair2.first;
                mo32382a(str2, bpzq, obj);
            } catch (abxw e5) {
                e = e5;
                obj4 = obj;
                absg.m48200c(e, "%s from %s failed", a, str);
                bpzq bpzq3 = bpzq.SEQUENCE_TABLE_FULL;
                String message2 = e.getMessage();
                bpzq = bpzq3;
                obj = obj4;
                str2 = message2;
                mo32382a(str2, bpzq, obj);
            } catch (abxx e6) {
                e = e6;
                obj3 = obj;
                absg.m48200c(e, "%s from %s failed", a, str);
                Pair a2 = mo32409a(e);
                bpzq = (bpzq) a2.second;
                obj = obj3;
                str2 = (String) a2.first;
                mo32382a(str2, bpzq, obj);
            } catch (Exception e7) {
                e = e7;
                absg.m48200c(e, "%s from %s failed", a, str);
                bpzq bpzq4 = bpzq.INTERNAL_ERROR;
                this.f58685a.mo32456a("AppIndexingTask INTERNAL_ERROR", e, cema.m137239f());
                bpzq = bpzq4;
                mo32382a(str2, bpzq, obj);
            }
        } catch (abxq e8) {
            e = e8;
            absg.m48200c(e, "%s from %s failed", a, str);
            Pair a3 = mo32408a(e);
            bpzq = (bpzq) a3.second;
            obj = obj2;
            str2 = (String) a3.first;
            mo32382a(str2, bpzq, obj);
        } catch (abws e9) {
            e = e9;
            absg.m48200c(e, "%s from %s failed", a, str);
            message = e.getMessage();
            if (message == null) {
                message = "(no message)";
            }
            bpzq bpzq22 = e.f58647a;
            actionImpl = e.f58649c;
            if (actionImpl == null) {
                String str3 = actionImpl.f152343c;
                StringBuilder sb = new StringBuilder(message.length() + 28 + String.valueOf(str3).length());
                sb.append(message);
                sb.append(" The invalid action url is: ");
                sb.append(str3);
                message = sb.toString();
            }
            briy.m114097a(String.format("Invalid Action detected: %s", message));
            abxp abxp2 = this.f58688d;
            abwu abwu2 = this.f58686b;
            abxp2.mo32415a(abwu2.f58652a, abwu2.f58653b, bpzq22, e.getMessage(), null, e.f58649c);
            Pair pair22 = new Pair(message, bpzq22);
            bpzq = (bpzq) pair22.second;
            obj = obj5;
            str2 = (String) pair22.first;
            mo32382a(str2, bpzq, obj);
        } catch (abxw e10) {
            e = e10;
            absg.m48200c(e, "%s from %s failed", a, str);
            bpzq bpzq32 = bpzq.SEQUENCE_TABLE_FULL;
            String message22 = e.getMessage();
            bpzq = bpzq32;
            obj = obj4;
            str2 = message22;
            mo32382a(str2, bpzq, obj);
        } catch (abxx e11) {
            e = e11;
            absg.m48200c(e, "%s from %s failed", a, str);
            Pair a22 = mo32409a(e);
            bpzq = (bpzq) a22.second;
            obj = obj3;
            str2 = (String) a22.first;
            mo32382a(str2, bpzq, obj);
        } catch (Exception e12) {
            e = e12;
            obj = null;
            absg.m48200c(e, "%s from %s failed", a, str);
            bpzq bpzq42 = bpzq.INTERNAL_ERROR;
            this.f58685a.mo32456a("AppIndexingTask INTERNAL_ERROR", e, cema.m137239f());
            bpzq = bpzq42;
            mo32382a(str2, bpzq, obj);
        }
        mo32382a(str2, bpzq, obj);
    }

    /* renamed from: a */
    public final Pair mo32409a(abxx abxx) {
        String message = abxx.getMessage();
        String valueOf = String.valueOf(abxx.f58709a);
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(valueOf).length());
        sb.append(message);
        sb.append(" The Slice URI is: ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        bpzq bpzq = abxx.f58710b;
        briy.m114097a(String.format("Invalid Slice detected: %s", abxx.f58709a));
        abxp abxp = this.f58688d;
        abwu abwu = this.f58686b;
        abxp.mo32415a(abwu.f58652a, abwu.f58653b, bpzq, abxx.getMessage(), null, null);
        return new Pair(sb2, bpzq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32382a(String str, bpzq bpzq, Object obj) {
        try {
            mo32377a(new Status(abxr.m48488a(bpzq), str), obj);
        } catch (RemoteException e) {
            absg.m48200c(e, "Client died during %s", this.f58686b.mo32392a());
            if (bpzq == bpzq.NO_ERROR) {
                bpzq = bpzq.CLIENT_DISCONNECTED;
            }
        }
        this.f58686b.mo32393a(this.f58687c, bpzq);
    }
}
