package p000;

/* renamed from: rpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rpx extends sno {

    /* renamed from: a */
    protected asfb f43509a;

    /* renamed from: b */
    private final String f43510b;

    /* renamed from: c */
    private String f43511c;

    public rpx(String str) {
        this.f43510b = str;
    }

    public void onCreate() {
        super.onCreate();
        String str = this.f43510b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("WakefulIntentService[");
        sb.append(str);
        sb.append("]");
        asfb asfb = new asfb(this, 1, sb.toString(), null, "com.google.android.gms", this.f43511c);
        this.f43509a = asfb;
        asfb.mo49117b();
    }

    public final void onDestroy() {
        this.f43509a.mo49120c();
        super.onDestroy();
    }

    public rpx(String str, String str2) {
        this.f43510b = str;
        this.f43511c = str2;
    }

    public rpx(String str, String str2, int i) {
        super(i);
        this.f43510b = str;
        this.f43511c = str2;
    }
}
