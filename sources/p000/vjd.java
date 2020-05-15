package p000;

import android.database.CursorWindow;
import java.util.Map;

/* renamed from: vjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjd extends vkc {

    /* renamed from: a */
    private final bkqk f49381a;

    public vjd(bkqk bkqk) {
        super(vka.f49385b);
        this.f49381a = bkqk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo28494a(CursorWindow cursorWindow, int i, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return cursorWindow.putString((String) entry.getKey(), i, 3) | vjb.m40509a(cursorWindow, i, (blhp) entry.getValue(), this.f49381a);
    }
}
