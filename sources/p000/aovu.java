package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovu extends aovg {

    /* renamed from: h */
    private final String f83699h;

    /* renamed from: i */
    private final TaskEntity f83700i;

    /* renamed from: j */
    private final UpdateRecurrenceOptions f83701j;

    /* renamed from: k */
    private String f83702k;

    public aovu(aost aost, String str, String str2, String str3, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(aost, str, str2, "MakeRecurrenceSingleInstance");
        this.f83699h = str3;
        this.f83700i = taskEntity;
        this.f83701j = updateRecurrenceOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6009;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        blox blox;
        bxvd da = blql.f127360g.mo74144da();
        blou a = aoww.m69743a(this.f83699h);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blql blql = (blql) da.f164949b;
            a.getClass();
            blql.f127364c = a;
            blql.f127362a |= 2;
        }
        blrj a2 = aoww.m69746a(this.f83700i);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blrj blrj = (blrj) bxvd.f164949b;
        blrj blrj2 = blrj.f127456w;
        blrj.f127461d = null;
        int i = blrj.f127458a & -5;
        blrj.f127458a = i;
        blrj.f127476s = null;
        blrj.f127458a = -262145 & i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blql blql2 = (blql) da.f164949b;
        blrj blrj3 = (blrj) bxvd.mo74062i();
        blrj3.getClass();
        blql2.f127366e = blrj3;
        blql2.f127362a |= 8;
        blrj blrj4 = (blrj) bxvd.f164949b;
        if ((blrj4.f127458a & 1) != 0) {
            blox = blrj4.f127459b;
            if (blox == null) {
                blox = blox.f127160d;
            }
        } else {
            bxvd da2 = blox.f127160d.mo74144da();
            String str = this.f83702k;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blox blox2 = (blox) da2.f164949b;
            str.getClass();
            blox2.f127162a |= 2;
            blox2.f127163b = str;
            blox = (blox) da2.mo74062i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blql blql3 = (blql) da.f164949b;
        blox.getClass();
        blql3.f127365d = blox;
        blql3.f127362a |= 4;
        blrb a3 = aoww.m69745a(this.f83701j);
        if (a3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blql blql4 = (blql) da.f164949b;
            a3.getClass();
            blql4.f127367f = a3;
            blql4.f127362a |= 16;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blql blql5 = (blql) da.f164949b;
        b.getClass();
        blql5.f127363b = b;
        blql5.f127362a |= 1;
        arrayList.add(mo46934a(8, (blql) da.mo74062i()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValue("deleted", 1).withSelection(aovg.m69616a(this.f83701j), mo46943a(this.f83699h, this.f83701j)).build());
        mo46939a(arrayList, this.f83699h, this.f83701j);
        this.f83702k = mo46935a(arrayList, this.f83700i);
    }
}
