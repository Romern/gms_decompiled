package p000;

import android.content.SharedPreferences;

/* renamed from: eoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eoc extends eog {

    /* renamed from: a */
    final /* synthetic */ Long f15380a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eoc(eoh eoh, String str, Long l) {
        super(eoh, str);
        this.f15380a = l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10349a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.f15384b) ? Long.valueOf(sharedPreferences.getLong(this.f15384b, 0)) : this.f15380a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10350a(SharedPreferences.Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            editor.putLong(this.f15384b, l.longValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Long");
    }
}
