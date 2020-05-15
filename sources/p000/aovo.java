package p000;

import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import java.util.ArrayList;

/* renamed from: aovo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovo extends aovg {

    /* renamed from: h */
    private final String f83690h;

    /* renamed from: i */
    private final UpdateRecurrenceOptions f83691i;

    public aovo(aost aost, String str, String str2, String str3, UpdateRecurrenceOptions updateRecurrenceOptions) {
        super(aost, str, str2, "DeleteRecurrence");
        this.f83690h = str3;
        this.f83691i = updateRecurrenceOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        String a = aovg.m69616a(this.f83691i);
        String[] a2 = mo46943a(this.f83690h, this.f83691i);
        mo46939a(arrayList, this.f83690h, this.f83691i);
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withValue("deleted", 1).withSelection(a, a2).build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        bxvd da = blps.f127286e.mo74144da();
        bxvd da2 = blou.f127145c.mo74144da();
        String str = this.f83690h;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blou blou = (blou) da2.f164949b;
        str.getClass();
        blou.f127147a |= 1;
        blou.f127148b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blps blps = (blps) da.f164949b;
        blou blou2 = (blou) da2.mo74062i();
        blou2.getClass();
        blps.f127290c = blou2;
        blps.f127288a |= 2;
        UpdateRecurrenceOptions updateRecurrenceOptions = this.f83691i;
        if (updateRecurrenceOptions != null) {
            blrb a = aoww.m69745a(updateRecurrenceOptions);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blps blps2 = (blps) da.f164949b;
            a.getClass();
            blps2.f127291d = a;
            blps2.f127288a |= 4;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blps blps3 = (blps) da.f164949b;
        b.getClass();
        blps3.f127289b = b;
        blps3.f127288a |= 1;
        arrayList.add(mo46934a(4, (blps) da.mo74062i()));
    }
}
