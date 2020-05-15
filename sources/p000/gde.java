package p000;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;

/* renamed from: gde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gde implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f17938a;

    /* renamed from: b */
    final /* synthetic */ gdf f17939b;

    public gde(gdf gdf, int i) {
        this.f17939b = gdf;
        this.f17938a = i;
    }

    public final void run() {
        srn srn = gdv.f17985a;
        Process.setThreadPriority(-19);
        ged ged = this.f17939b.f17945f;
        if (ged.f18020a == null) {
            ged.f18020a = new AudioRecord(ged.f18022c, ged.f18024e, ged.f18021b, 2, ged.m13007a(ged.f18025f));
        }
        AudioRecord audioRecord = ged.f18020a;
        try {
            audioRecord.startRecording();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f17938a);
            while (!this.f17939b.f17944e.get()) {
                int read = audioRecord.read(allocateDirect, allocateDirect.capacity());
                if (read > 0) {
                    allocateDirect.limit(read);
                    allocateDirect.position(0);
                    for (gcd gcd : (gcd[]) this.f17939b.f17941b.f18130a) {
                        gcd.mo11639a(allocateDirect);
                    }
                    allocateDirect.clear();
                } else if (read == -3) {
                    this.f17939b.f17942c.mo11749a(17);
                    this.f17939b.f17944e.set(true);
                    this.f17939b.mo11678f();
                }
                System.currentTimeMillis();
                long j = this.f17939b.f17946g;
            }
            this.f17939b.f17946g = 0;
            try {
                audioRecord.stop();
            } catch (IllegalStateException e) {
                bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("gde", "run", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error when stopping AudioRecord");
            }
            gds.m12998a(this.f17939b.f17940a);
            ged ged2 = this.f17939b.f17945f;
            ged2.f18020a.release();
            ged2.f18020a = null;
            this.f17939b.f17944e.set(false);
            this.f17939b.f17943d.set(false);
            for (gcd gcd2 : (gcd[]) this.f17939b.f17941b.f18130a) {
                gcd2.mo11638a();
            }
        } catch (IllegalStateException e2) {
            this.f17939b.f17942c.mo11749a(16);
            this.f17939b.mo11678f();
            this.f17939b.f17943d.set(false);
        }
    }
}
