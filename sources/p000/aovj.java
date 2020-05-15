package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovj extends aovg {

    /* renamed from: h */
    private final String f83679h;

    /* renamed from: i */
    private final TaskEntity f83680i;

    /* renamed from: j */
    private final UpdateRecurrenceOptions f83681j;

    public aovj(aost aost, String str, String str2, String str3, TaskEntity taskEntity, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(aost, str, str2, "ChangeRecurrence");
        this.f83679h = str3;
        this.f83680i = taskEntity;
        this.f83681j = updateRecurrenceOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValue("deleted", 1).withSelection(aovg.m69616a(this.f83681j), mo46943a(this.f83679h, this.f83681j)).build());
        mo46939a(arrayList, this.f83679h, this.f83681j);
        mo46946b(arrayList, this.f83680i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blph.f127219h.mo74144da();
        blou a = aoww.m69743a(this.f83679h);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blph blph = (blph) da.f164949b;
            a.getClass();
            blph.f127223c = a;
            blph.f127221a |= 2;
        }
        blou a2 = aoww.m69743a(this.f83680i.f107187q.mo58678d());
        if (a2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blph blph2 = (blph) da.f164949b;
            a2.getClass();
            blph2.f127224d = a2;
            blph2.f127221a |= 4;
        }
        blrj a3 = aoww.m69746a(this.f83680i);
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        blov blov = ((blrj) bxvd.f164949b).f127476s;
        if (blov == null) {
            blov = blov.f127149f;
        }
        blot blot = blov.f127152b;
        if (blot == null) {
            blot = blot.f127133j;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blph blph3 = (blph) da.f164949b;
        blot.getClass();
        blph3.f127225e = blot;
        blph3.f127221a |= 8;
        aovg.m69617a(bxvd);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blph blph4 = (blph) da.f164949b;
        blrj blrj = (blrj) bxvd.mo74062i();
        blrj.getClass();
        blph4.f127226f = blrj;
        blph4.f127221a |= 16;
        blrb a4 = aoww.m69745a(this.f83681j);
        if (a4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blph blph5 = (blph) da.f164949b;
            a4.getClass();
            blph5.f127227g = a4;
            blph5.f127221a |= 32;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blph blph6 = (blph) da.f164949b;
        b.getClass();
        blph6.f127222b = b;
        blph6.f127221a |= 1;
        arrayList.add(mo46934a(9, (blph) da.mo74062i()));
    }
}
