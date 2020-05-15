package p000;

/* renamed from: tth */
final /* synthetic */ class tth implements Runnable {

    /* renamed from: a */
    private final ttp f46633a;

    /* renamed from: b */
    private final String f46634b;

    public tth(ttp ttp, String str) {
        this.f46633a = ttp;
        this.f46634b = str;
    }

    public final void run() {
        ttp ttp = this.f46633a;
        if (!ttp.f46648a.getText().toString().equals(this.f46634b)) {
            ttp.f46652e = tto.WAS_EDITED;
        }
        ttp.mo26793b();
        ttp.mo26796e();
    }
}
