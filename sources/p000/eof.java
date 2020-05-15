package p000;

import android.content.SharedPreferences;

/* renamed from: eof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eof extends eog {

    /* renamed from: a */
    final /* synthetic */ Integer f15383a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eof(eoh eoh, String str, Integer num) {
        super(eoh, str);
        this.f15383a = num;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10349a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.f15384b) ? Integer.valueOf(sharedPreferences.getInt(this.f15384b, 0)) : this.f15383a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10350a(SharedPreferences.Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            editor.putInt(this.f15384b, num.intValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Integer");
    }
}
