package p000;

import android.database.CursorWindow;

/* renamed from: vjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjc extends vkc {

    /* renamed from: a */
    private final bkqk f49380a;

    public vjc(bkqk bkqk) {
        super(vka.f49384a);
        this.f49380a = bkqk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28494a(CursorWindow cursorWindow, int i, Object obj) {
        if (obj instanceof blhp) {
            return vjb.m40509a(cursorWindow, i, (blhp) obj, this.f49380a);
        }
        return cursorWindow.putString((String) obj, i, 1) & cursorWindow.putLong(3, i, 0);
    }
}
