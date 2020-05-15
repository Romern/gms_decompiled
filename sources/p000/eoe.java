package p000;

import android.content.SharedPreferences;

/* renamed from: eoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eoe extends eog {

    /* renamed from: a */
    final /* synthetic */ Boolean f15382a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eoe(eoh eoh, String str, Boolean bool) {
        super(eoh, str);
        this.f15382a = bool;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10349a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.f15384b) ? Boolean.valueOf(sharedPreferences.getBoolean(this.f15384b, false)) : this.f15382a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10350a(SharedPreferences.Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            editor.putBoolean(this.f15384b, bool.booleanValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Boolean");
    }
}
