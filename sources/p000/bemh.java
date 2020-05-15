package p000;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: bemh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemh implements SQLiteTransactionListener {

    /* renamed from: a */
    final /* synthetic */ bemi f111821a;

    public bemh(bemi bemi) {
        this.f111821a = bemi;
    }

    public final void onBegin() {
    }

    public final void onCommit() {
    }

    public final void onRollback() {
        if (!this.f111821a.f111822a) {
            throw new benn();
        }
    }
}
