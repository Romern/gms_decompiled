package p000;

import android.app.AlertDialog;
import java.util.concurrent.ExecutionException;

/* renamed from: lot */
final /* synthetic */ class lot implements Runnable {

    /* renamed from: a */
    private final lpc f26512a;

    /* renamed from: b */
    private final bqgg f26513b;

    /* renamed from: c */
    private final lpb f26514c;

    public lot(lpc lpc, bqgg bqgg, lpb lpb) {
        this.f26512a = lpc;
        this.f26513b = bqgg;
        this.f26514c = lpb;
    }

    public final void run() {
        lpc lpc = this.f26512a;
        bqgg bqgg = this.f26513b;
        lpb lpb = this.f26514c;
        try {
            if (((Boolean) bqgg.get()).booleanValue()) {
                if (lpc.f26528d.contains(lpb)) {
                    lpc.f26528d.remove(lpb);
                    lpc.mo15333h();
                    return;
                } else if (lpb.mo15297b()) {
                    lpc.f26528d.add(lpb);
                    lpc.mo15332a(new loz(lpc));
                    return;
                } else {
                    lpc.mo15333h();
                    return;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lpc.f26159a);
        builder.setTitle("Failed to change flag value");
        builder.setMessage("Not sure what happened ... try again?");
        builder.show();
        lpc.mo15333h();
    }
}
