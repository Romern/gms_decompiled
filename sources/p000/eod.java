package p000;

import android.content.SharedPreferences;

/* renamed from: eod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eod extends eog {

    /* renamed from: a */
    final /* synthetic */ String f15381a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eod(eoh eoh, String str, String str2) {
        super(eoh, str);
        this.f15381a = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10349a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f15384b, this.f15381a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10350a(SharedPreferences.Editor editor, Object obj) {
        String str = (String) obj;
        if (str != null) {
            editor.putString(this.f15384b, str);
            return;
        }
        throw new IllegalArgumentException("null cannot be written for String");
    }
}
