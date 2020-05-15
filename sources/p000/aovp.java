package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;

/* renamed from: aovp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovp extends aovg {

    /* renamed from: h */
    private final TaskIdEntity f83692h;

    public aovp(aost aost, String str, String str2, TaskIdEntity taskIdEntity) {
        super(aost, str, str2, "DeleteReminder");
        sdo.m34959a(taskIdEntity);
        this.f83692h = taskIdEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6003;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blpu.f127295d.mo74144da();
        TaskIdEntity taskIdEntity = this.f83692h;
        if (taskIdEntity != null) {
            blox a = aoww.m69744a(taskIdEntity);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpu blpu = (blpu) da.f164949b;
            a.getClass();
            if (!blpu.f127299c.mo73666a()) {
                blpu.f127299c = GeneratedMessageLite.m124021a(blpu.f127299c);
            }
            blpu.f127299c.add(a);
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpu blpu2 = (blpu) da.f164949b;
        b.getClass();
        blpu2.f127298b = b;
        blpu2.f127297a |= 1;
        arrayList.add(mo46934a(3, (blpu) da.mo74062i()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        String[] a = mo46942a(this.f83692h);
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", a).withExpectedCount(1).build());
        arrayList.add(ContentProviderOperation.newAssertQuery(aotd.f83574a).withSelection(aowt.m69729a("client_assigned_id=? AND account_id=? AND deleted=0", "recurrence_master=1"), a).withExpectedCount(0).build());
        mo46937a(arrayList, this.f83692h);
    }
}
