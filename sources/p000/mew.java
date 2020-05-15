package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: mew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mew extends adzt {

    /* renamed from: a */
    final /* synthetic */ mex f33551a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mew(mex mex, Looper looper) {
        super(looper);
        this.f33551a = mex;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            mex mex = this.f33551a;
            lvn lvn = mex.f33552a;
            mex.f33559h = true;
            mex.f33552a.mo25418e("Backup task timed out. pkg=%s", this.f33551a.f33553b);
            this.f33551a.mo19904a(1);
        } else if (i == 1) {
            mex mex2 = this.f33551a;
            lvn lvn2 = mex.f33552a;
            if (mex2.f33559h) {
                mex.f33552a.mo25416d("Backup Result Received after timeout: %d", Integer.valueOf(message.arg1));
            } else if (message.arg1 != 0) {
                this.f33551a.mo19905b(message.arg1);
            } else {
                String str = (String) message.obj;
                if (this.f33551a.f33553b.equals(str)) {
                    boolean renameTo = this.f33551a.f33556e.mo19922b(str).renameTo(this.f33551a.f33556e.mo19920a(str));
                    mex.f33552a.mo25412b("Moving file after backup: %s %b", str, Boolean.valueOf(renameTo));
                    if (!renameTo) {
                        this.f33551a.mo19905b(9);
                    } else {
                        this.f33551a.mo19905b(0);
                    }
                }
            }
        } else if (i != 2) {
            mex.f33552a.mo25418e("Message of unknown type: %d", Integer.valueOf(message.what));
        } else {
            mex mex3 = this.f33551a;
            lvn lvn3 = mex.f33552a;
            if (mex3.f33559h) {
                mex.f33552a.mo25416d("Backup Finish Received after timeout: %d", Integer.valueOf(message.arg1));
                return;
            }
            mex3.mo19904a(message.arg1);
        }
    }
}
