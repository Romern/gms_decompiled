package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: beon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class beon {

    /* renamed from: a */
    public final Object f111941a;

    /* renamed from: b */
    public final String f111942b;

    /* renamed from: c */
    public final beol[] f111943c;

    /* renamed from: d */
    Map f111944d;

    /* renamed from: e */
    public int f111945e;

    /* renamed from: f */
    private final beop f111946f;

    /* renamed from: g */
    private boolean f111947g = true;

    public beon(String str, beop beop, beol... beolArr) {
        int i = 1;
        int length = beolArr.length;
        i = length > 0 ? 10 : i;
        bmxy.m108581a(str);
        this.f111942b = str;
        this.f111943c = beolArr;
        HashMap hashMap = new HashMap(i);
        this.f111944d = hashMap;
        if (length == 0) {
            hashMap.put(beoc.f111924b, mo60851a());
        }
        this.f111945e = 0;
        bmxy.m108581a(beop);
        this.f111946f = beop;
        this.f111941a = new Object();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ beod mo60851a() {
        return new beoi();
    }

    /* renamed from: b */
    public final void mo60860b() {
        this.f111947g = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        if (((p000.beox) r9).f111965f.isCancelled() == false) goto L_0x00fe;
     */
    /* renamed from: a */
    public final void mo60857a(Object obj, beoc beoc) {
        beox beox;
        ScheduledFuture<?> scheduledFuture;
        synchronized (this.f111941a) {
            beod beod = (beod) this.f111944d.get(beoc);
            if (beod == null) {
                beod = mo60851a();
                this.f111944d.put(beoc, beod);
            }
            beod.mo60846a(obj);
            this.f111945e++;
        }
        beoo beoo = ((beoq) this.f111946f).f111953c;
        if (beoo != null) {
            beox beox2 = (beox) beoo;
            if (beox2.f111962c > 0 && beox2.f111964e.incrementAndGet() >= beox2.f111962c) {
                synchronized (beox2.f111966g) {
                    if (((beox) beoo).f111964e.get() >= ((beox) beoo).f111962c) {
                        synchronized (((beox) beoo).f111966g) {
                            ScheduledFuture scheduledFuture2 = ((beox) beoo).f111965f;
                            if (scheduledFuture2 != null) {
                                if (!scheduledFuture2.isDone() && !((beox) beoo).f111965f.isCancelled()) {
                                    if (((beox) beoo).f111965f.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                        ((beox) beoo).mo60869a();
                                        scheduledFuture = ((beox) beoo).f111960a.schedule(new beov((beox) beoo), 1, TimeUnit.MILLISECONDS);
                                        beox = (beox) beoo;
                                        beox.f111965f = scheduledFuture;
                                    }
                                }
                            }
                            scheduledFuture = ((beox) beoo).f111960a.schedule(new beou((beox) beoo), 1, TimeUnit.MILLISECONDS);
                            beox = (beox) beoo;
                            beox.f111965f = scheduledFuture;
                        }
                        return;
                    }
                }
            }
            synchronized (beox2.f111966g) {
                ScheduledFuture scheduledFuture3 = ((beox) beoo).f111965f;
                if (scheduledFuture3 != null) {
                    if (!scheduledFuture3.isDone()) {
                    }
                }
                ((beox) beoo).f111965f = ((beox) beoo).f111960a.schedule(new beow((beox) beoo), ((beox) beoo).f111963d, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public final void mo60861b(Object... objArr) {
        mo60859a(objArr);
        mo60857a(1L, new beoc(objArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60858a(beol... beolArr) {
        if (!Arrays.equals(this.f111943c, beolArr)) {
            String str = this.f111942b;
            String arrays = Arrays.toString(this.f111943c);
            String arrays2 = Arrays.toString(beolArr);
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb.append("Streamz ");
            sb.append(str);
            sb.append(" with field diffs: ");
            sb.append(arrays);
            sb.append(" and ");
            sb.append(arrays2);
            throw new beot(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60859a(Object... objArr) {
        boolean z;
        int i = 0;
        if (this.f111943c.length == objArr.length) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (this.f111947g) {
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj == null) {
                    String str = this.f111942b;
                    String arrays = Arrays.toString(objArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(arrays).length());
                    sb.append("Streamz ");
                    sb.append(str);
                    sb.append(" has null parameter: ");
                    sb.append(arrays);
                    throw new NullPointerException(sb.toString());
                } else if (this.f111943c[i].f111936b.isInstance(obj)) {
                    i++;
                } else {
                    String str2 = this.f111942b;
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(obj.getClass());
                    beol beol = this.f111943c[i];
                    String str3 = beol.f111935a;
                    String valueOf3 = String.valueOf(beol.f111936b);
                    int length = String.valueOf(str2).length();
                    int length2 = String.valueOf(valueOf).length();
                    int length3 = String.valueOf(valueOf2).length();
                    StringBuilder sb2 = new StringBuilder(length + 92 + length2 + length3 + str3.length() + String.valueOf(valueOf3).length());
                    sb2.append("Streamz ");
                    sb2.append(str2);
                    sb2.append(" has parameter {index: ");
                    sb2.append(i);
                    sb2.append(", value: ");
                    sb2.append(valueOf);
                    sb2.append(", type: ");
                    sb2.append(valueOf2);
                    sb2.append("}, but expected: {name: ");
                    sb2.append(str3);
                    sb2.append(", type: ");
                    sb2.append(valueOf3);
                    sb2.append("}");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }
}
