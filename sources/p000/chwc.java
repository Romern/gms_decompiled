package p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: chwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwc implements chwk {

    /* renamed from: a */
    final /* synthetic */ chwe f189318a;

    public chwc(chwe chwe) {
        this.f189318a = chwe;
    }

    /* renamed from: a */
    public final void mo85727a(int i) {
        chwd chwd = this.f189318a.f189345o;
        int i2 = chwd.f189319i;
        synchronized (chwd.f189320a) {
            this.f189318a.f189345o.mo85776b(i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.BidirectionalStream.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.BidirectionalStream$Builder
     arg types: [java.lang.String, java.lang.String]
     candidates:
      org.chromium.net.ExperimentalBidirectionalStream.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.ExperimentalBidirectionalStream$Builder
      org.chromium.net.BidirectionalStream.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.BidirectionalStream$Builder */
    /* renamed from: a */
    public final void mo85728a(chtr chtr) {
        this.f189318a.f189340j.run();
        chwe chwe = this.f189318a;
        if (chwe.f189346p != null) {
            chwa chwa = new chwa(chwe);
            chwe chwe2 = this.f189318a;
            String str = chwe2.f189334d;
            chvy chvy = (chvy) chwe2.f189346p;
            ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) chvy.f189303e).newBidirectionalStreamBuilder(str, chwa, chwe2.f189337g);
            if (chvy.f189304f) {
                int i = chvy.f189305g;
                if (!chvy.f189299a) {
                    synchronized (chvy.class) {
                        if (!chvy.f189299a) {
                            try {
                                chvy.f189301c = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsTag", Integer.TYPE);
                                chvy.f189299a = true;
                            } catch (NoSuchMethodException e) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsTag", e);
                                    chvy.f189299a = true;
                                } catch (Throwable th) {
                                    chvy.f189299a = true;
                                    throw th;
                                }
                            }
                        }
                    }
                }
                if (chvy.f189301c != null) {
                    try {
                        chvy.f189301c.invoke(newBidirectionalStreamBuilder, Integer.valueOf(i));
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Failed to set traffic stats tag: ");
                        sb.append(i);
                        Log.w("CronetChannelBuilder", sb.toString(), e3);
                    }
                }
            }
            if (chvy.f189306h) {
                int i2 = chvy.f189307i;
                if (!chvy.f189300b) {
                    synchronized (chvy.class) {
                        if (!chvy.f189300b) {
                            try {
                                chvy.f189302d = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsUid", Integer.TYPE);
                                chvy.f189300b = true;
                            } catch (NoSuchMethodException e4) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsUid", e4);
                                    chvy.f189300b = true;
                                } catch (Throwable th2) {
                                    chvy.f189300b = true;
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                if (chvy.f189302d != null) {
                    try {
                        chvy.f189302d.invoke(newBidirectionalStreamBuilder, Integer.valueOf(i2));
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause() != null ? e5.getCause() : e5.getTargetException());
                    } catch (IllegalAccessException e6) {
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Failed to set traffic stats uid: ");
                        sb2.append(i2);
                        Log.w("CronetChannelBuilder", sb2.toString(), e6);
                    }
                }
            }
            if (this.f189318a.f189342l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            chwe chwe3 = this.f189318a;
            Object obj = chwe3.f189343m;
            if (!(obj == null && chwe3.f189344n == null)) {
                if (obj != null) {
                    chwe.m149671a(newBidirectionalStreamBuilder, obj);
                }
                Collection<Object> collection = this.f189318a.f189344n;
                if (collection != null) {
                    for (Object obj2 : collection) {
                        chwe.m149671a(newBidirectionalStreamBuilder, obj2);
                    }
                }
            }
            chwe chwe4 = this.f189318a;
            newBidirectionalStreamBuilder.addHeader(ciag.f189651h.f189129a, chwe4.f189335e);
            newBidirectionalStreamBuilder.addHeader(ciag.f189649f.f189129a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            byte[][] a = cife.m150161a(chwe4.f189338h);
            for (int i3 = 0; i3 < a.length; i3 += 2) {
                String str2 = new String(a[i3], Charset.forName("UTF-8"));
                if (!ciag.f189649f.f189129a.equalsIgnoreCase(str2) && !ciag.f189651h.f189129a.equalsIgnoreCase(str2) && !ciag.f189650g.f189129a.equalsIgnoreCase(str2)) {
                    newBidirectionalStreamBuilder.addHeader(str2, new String(a[i3 + 1], Charset.forName("UTF-8")));
                }
            }
            this.f189318a.f189341k = newBidirectionalStreamBuilder.build();
            this.f189318a.f189341k.start();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.util.Collection], assign insn: 0x0016: IGET  (r2v2 ? I:java.util.Collection) = (r1v2 chwd) chwd.b java.util.Collection */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo85729a(chuv chuv) {
        chwd chwd = this.f189318a.f189345o;
        int i = chwd.f189319i;
        synchronized (chwd.f189320a) {
            chwd chwd2 = this.f189318a.f189345o;
            if (!chwd2.f189323d) {
                chwd2.f189323d = true;
                chwd2.f189324e = chuv;
                ? r2 = chwd2.f189321b;
                int size = r2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((chwb) r2.get(i2)).f189315a.clear();
                }
                chwd2.f189321b.clear();
                chwe chwe = this.f189318a;
                BidirectionalStream bidirectionalStream = chwe.f189341k;
                if (bidirectionalStream == null) {
                    chwe.f189339i.mo85747a(chwe, chuv);
                } else {
                    bidirectionalStream.cancel();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo85730a(cifi cifi, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        chwd chwd = this.f189318a.f189345o;
        int i2 = chwd.f189319i;
        synchronized (chwd.f189320a) {
            if (!this.f189318a.f189345o.f189323d) {
                if (cifi == null) {
                    byteBuffer = chwe.f189329a;
                } else {
                    byteBuffer = ((chwi) cifi).f189376a;
                    byteBuffer.flip();
                }
                this.f189318a.mo85781d(byteBuffer.remaining());
                chwe chwe = this.f189318a;
                chwd chwd2 = chwe.f189345o;
                if (!chwd2.f189322c) {
                    chwd2.f189321b.add(new chwb(byteBuffer, z, z2));
                } else {
                    chwe.mo85737a(byteBuffer, z, z2);
                }
            }
        }
    }
}
