package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TimeEntity;
import java.util.ArrayList;

/* renamed from: aovy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovy extends aovg {

    /* renamed from: h */
    private final CustomizedSnoozePresetEntity f83707h;

    public aovy(aost aost, String str, String str2, CustomizedSnoozePresetEntity customizedSnoozePresetEntity) {
        super(aost, str, str2, "SetCustomizedSnoozePreset");
        this.f83707h = customizedSnoozePresetEntity;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        if (!aowz.m69769a(context)) {
            aowz.m69770b(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (this.f83707h.f107119a != null) {
            bxvd da = blrg.f127444d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrg blrg = (blrg) da.f164949b;
            blrg.f127447b = 1;
            blrg.f127446a |= 1;
            blnu a = aoww.m69740a(this.f83707h.f107119a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrg blrg2 = (blrg) da.f164949b;
            a.getClass();
            blrg2.f127448c = a;
            blrg2.f127446a |= 8;
            arrayList2.add((blrg) da.mo74062i());
        }
        if (this.f83707h.f107120b != null) {
            bxvd da2 = blrg.f127444d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blrg blrg3 = (blrg) da2.f164949b;
            blrg3.f127447b = 2;
            blrg3.f127446a |= 1;
            blnu a2 = aoww.m69740a(this.f83707h.f107120b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blrg blrg4 = (blrg) da2.f164949b;
            a2.getClass();
            blrg4.f127448c = a2;
            blrg4.f127446a |= 8;
            arrayList2.add((blrg) da2.mo74062i());
        }
        if (this.f83707h.f107121c != null) {
            bxvd da3 = blrg.f127444d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blrg blrg5 = (blrg) da3.f164949b;
            blrg5.f127447b = 3;
            blrg5.f127446a = 1 | blrg5.f127446a;
            blnu a3 = aoww.m69740a(this.f83707h.f107121c);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            blrg blrg6 = (blrg) da3.f164949b;
            a3.getClass();
            blrg6.f127448c = a3;
            blrg6.f127446a |= 8;
            arrayList2.add((blrg) da3.mo74062i());
        }
        if (arrayList2.size() > 0) {
            bxvd da4 = blrh.f127450b.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            blrh blrh = (blrh) da4.f164949b;
            if (!blrh.f127452a.mo73666a()) {
                blrh.f127452a = bxvk.m124021a(blrh.f127452a);
            }
            bxsy.m123078a(arrayList2, blrh.f127452a);
            arrayList.add(mo46934a(11, (blrh) da4.mo74062i()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        ContentValues contentValues = new ContentValues();
        TimeEntity timeEntity = this.f83707h.f107119a;
        if (timeEntity != null) {
            contentValues.put("morning_customized_time", Long.valueOf(aosd.m69442a(timeEntity)));
        }
        TimeEntity timeEntity2 = this.f83707h.f107120b;
        if (timeEntity2 != null) {
            contentValues.put("afternoon_customized_time", Long.valueOf(aosd.m69442a(timeEntity2)));
        }
        TimeEntity timeEntity3 = this.f83707h.f107121c;
        if (timeEntity3 != null) {
            contentValues.put("evening_customized_time", Long.valueOf(aosd.m69442a(timeEntity3)));
        }
        if (contentValues.size() > 0) {
            arrayList.add(ContentProviderOperation.newUpdate(aosy.f83568a).withSelection("account_name=?", new String[]{this.f83670b}).withValues(contentValues).build());
        }
    }
}
