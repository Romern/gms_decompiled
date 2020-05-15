package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovv extends aovg {

    /* renamed from: h */
    private final TaskEntity f83703h;

    public aovv(aost aost, String str, String str2, TaskEntity taskEntity) {
        super(aost, str, str2, "MakeTaskRecurring");
        this.f83703h = taskEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6008;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blqn.f127372g.mo74144da();
        blrj a = aoww.m69746a(this.f83703h);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        blox blox = ((blrj) bxvd.f164949b).f127459b;
        if (blox == null) {
            blox = blox.f127160d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqn blqn = (blqn) da.f164949b;
        blox.getClass();
        blqn.f127376c = blox;
        blqn.f127374a |= 2;
        blov blov = ((blrj) bxvd.f164949b).f127476s;
        if (blov == null) {
            blov = blov.f127149f;
        }
        blou blou = blov.f127153c;
        if (blou == null) {
            blou = blou.f127145c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqn blqn2 = (blqn) da.f164949b;
        blou.getClass();
        blqn2.f127377d = blou;
        blqn2.f127374a |= 4;
        blov blov2 = ((blrj) bxvd.f164949b).f127476s;
        if (blov2 == null) {
            blov2 = blov.f127149f;
        }
        blot blot = blov2.f127152b;
        if (blot == null) {
            blot = blot.f127133j;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqn blqn3 = (blqn) da.f164949b;
        blot.getClass();
        blqn3.f127378e = blot;
        blqn3.f127374a |= 8;
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqn blqn4 = (blqn) da.f164949b;
        b.getClass();
        blqn4.f127375b = b;
        blqn4.f127374a |= 1;
        aovg.m69617a(bxvd);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqn blqn5 = (blqn) da.f164949b;
        blrj blrj = (blrj) bxvd.mo74062i();
        blrj.getClass();
        blqn5.f127379f = blrj;
        blqn5.f127374a |= 16;
        arrayList.add(mo46934a(7, (blqn) da.mo74062i()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        String[] a = mo46942a(this.f83703h.f107171a);
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a).withExpectedCount(1).build());
        ContentProviderOperation.Builder newAssertQuery = ContentProviderOperation.newAssertQuery(aotd.f83574a);
        StringBuilder sb = new StringBuilder(81);
        sb.append("client_assigned_id=? AND account_id=? AND deleted=0 AND recurrence_id IS NOT NULL");
        arrayList.add(newAssertQuery.withSelection(sb.toString(), a).withExpectedCount(0).build());
        mo46938a(arrayList, this.f83703h.f107187q.mo58678d());
        mo46937a(arrayList, this.f83703h.f107171a);
        mo46946b(arrayList, this.f83703h);
    }
}
