package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;

/* renamed from: aovi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovi extends aovg {

    /* renamed from: h */
    private final TaskIdEntity f83678h;

    public aovi(aost aost, String str, String str2, TaskIdEntity taskIdEntity) {
        super(aost, str, str2, "BumpReminder");
        this.f83678h = taskIdEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6010;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blpf.f127211d.mo74144da();
        TaskIdEntity taskIdEntity = this.f83678h;
        if (taskIdEntity != null) {
            blox a = aoww.m69744a(taskIdEntity);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpf blpf = (blpf) da.f164949b;
            a.getClass();
            blpf.f127215c = a;
            blpf.f127213a |= 2;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpf blpf2 = (blpf) da.f164949b;
        b.getClass();
        blpf2.f127214b = b;
        blpf2.f127213a |= 1;
        arrayList.add(mo46934a(0, (blpf) da.mo74062i()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        String[] a = mo46942a(this.f83678h);
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a).withExpectedCount(1).build());
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83579f).withValue("fired_time_millis", 0).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a).build());
    }
}
