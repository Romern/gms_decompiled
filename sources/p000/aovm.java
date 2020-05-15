package p000;

import android.content.Context;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovm extends aovg {

    /* renamed from: h */
    private final TaskEntity f83686h;

    public aovm(aost aost, String str, String str2, TaskEntity taskEntity) {
        super(aost, str, str2, "CreateRecurrence");
        this.f83686h = taskEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6004;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blpm.f127244g.mo74144da();
        blrj a = aoww.m69746a(this.f83686h);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        blov blov = ((blrj) bxvd.f164949b).f127476s;
        if (blov == null) {
            blov = blov.f127149f;
        }
        if ((blov.f127151a & 1) != 0) {
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
            blpm blpm = (blpm) da.f164949b;
            blot.getClass();
            blpm.f127251f = blot;
            blpm.f127246a |= 16;
        }
        blov blov3 = ((blrj) bxvd.f164949b).f127476s;
        if (blov3 == null) {
            blov3 = blov.f127149f;
        }
        if ((blov3.f127151a & 2) != 0) {
            blov blov4 = ((blrj) bxvd.f164949b).f127476s;
            if (blov4 == null) {
                blov4 = blov.f127149f;
            }
            blou blou = blov4.f127153c;
            if (blou == null) {
                blou = blou.f127145c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpm blpm2 = (blpm) da.f164949b;
            blou.getClass();
            blpm2.f127249d = blou;
            blpm2.f127246a |= 4;
        }
        blrj blrj = (blrj) bxvd.f164949b;
        if ((blrj.f127458a & 4) != 0) {
            blrn blrn = blrj.f127461d;
            if (blrn == null) {
                blrn = blrn.f127488c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpm blpm3 = (blpm) da.f164949b;
            blrn.getClass();
            blpm3.f127248c = blrn;
            blpm3.f127246a |= 2;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpm blpm4 = (blpm) da.f164949b;
        b.getClass();
        blpm4.f127247b = b;
        blpm4.f127246a |= 1;
        aovg.m69617a(bxvd);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpm blpm5 = (blpm) da.f164949b;
        blrj blrj2 = (blrj) bxvd.mo74062i();
        blrj2.getClass();
        blpm5.f127250e = blrj2;
        blpm5.f127246a |= 8;
        arrayList.add(mo46934a(2, (blpm) da.mo74062i()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aovg.a(android.content.Context, boolean):boolean
     arg types: [android.content.Context, int]
     candidates:
      aovg.a(int, bxxc):android.content.ContentProviderOperation
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskEntity):java.lang.String
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskId):void
      aovg.a(java.util.ArrayList, java.lang.String):void
      aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean
      aovg.a(java.lang.String, com.google.android.gms.reminders.UpdateRecurrenceOptions):java.lang.String[]
      aovg.a(android.content.Context, boolean):boolean */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (mo46940a(context, false)) {
            aovd.m69610a().mo46932a(aouu.m69571a(this.f83686h.f107187q.mo58678d()), this.f83675g);
            aowf.m69693a(this.f83672d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        mo46946b(arrayList, this.f83686h);
    }
}
