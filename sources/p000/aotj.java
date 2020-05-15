package p000;

import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.Time;

/* renamed from: aotj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotj {

    /* renamed from: a */
    private Time f83584a;

    /* renamed from: b */
    private Time f83585b;

    /* renamed from: c */
    private Time f83586c;

    /* renamed from: a */
    public final CustomizedSnoozePreset mo46866a() {
        return new CustomizedSnoozePresetEntity(this.f83584a, this.f83585b, this.f83586c);
    }

    /* renamed from: b */
    public final void mo46868b(Time time) {
        this.f83586c = time != null ? (Time) time.mo7556bF() : null;
    }

    /* renamed from: c */
    public final void mo46869c(Time time) {
        this.f83584a = time != null ? (Time) time.mo7556bF() : null;
    }

    /* renamed from: a */
    public final void mo46867a(Time time) {
        this.f83585b = time != null ? (Time) time.mo7556bF() : null;
    }
}
