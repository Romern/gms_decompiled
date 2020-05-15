package p000;

import android.os.SystemClock;

/* renamed from: aklf */
final /* synthetic */ class aklf implements aklo {

    /* renamed from: a */
    private final aklk f72192a;

    public aklf(aklk aklk) {
        this.f72192a = aklk;
    }

    /* renamed from: a */
    public final void mo39534a(boolean z) {
        String str;
        aklk aklk = this.f72192a;
        Object[] objArr = new Object[1];
        if (!z) {
            str = "Did not Receive";
        } else {
            str = "Received";
        }
        objArr[0] = str;
        int i = eoa.f15378a;
        if (aklk.mo39541a()) {
            int intValue = ((Integer) akka.f72131f.mo10351a()).intValue();
            if (!z) {
                eoa.m10828c("NetRec", "Delaying next network request", new Object[0]);
                aknf.m60075a("NetworkRequestDelayed");
                intValue = Math.max(intValue, (int) cfpm.f185392a.mo6606a().mo82472h());
            }
            aklk.f72208j = SystemClock.uptimeMillis() + ((long) intValue);
            aklk.f72201c.postAtTime(new aklg(aklk), aklk.f72208j);
        }
    }
}
