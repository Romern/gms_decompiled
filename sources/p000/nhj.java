package p000;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioPolicy;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import java.nio.ByteBuffer;

/* renamed from: nhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nhj extends Thread {

    /* renamed from: a */
    final /* synthetic */ nhk f35615a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nhj(nhk nhk, String str) {
        super(str);
        this.f35615a = nhk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a4  */
    public final void run() {
        int i;
        AudioRecord audioRecord;
        boolean z;
        boolean z2;
        nwy nwy;
        boolean z3;
        nwy nwy2;
        int i2;
        int i3;
        Object obj;
        njp.m26589a();
        Process.setThreadPriority(-19);
        nhk nhk = this.f35615a;
        int i4 = nhk.f35620b;
        int a = nxa.m28078a(i4);
        int i5 = 3;
        if (nhk.f35620b != 3) {
            i = 2048;
        } else {
            i = 8192;
        }
        int i6 = i * 8;
        bnsi d = nhk.f35619a.mo68390d();
        d.mo68432a("nhk", "e", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Start capturing system audio with stream type: %s, sampling rate: %d, buffer size: %d", Integer.valueOf(nhk.f35620b), Integer.valueOf(a), Integer.valueOf(i6));
        if (nhk.f35629k.mo21351u() == 0) {
            int i7 = Build.VERSION.SDK_INT;
        }
        if (nhk.f35631m != null && !nhk.f35637s) {
            bnsi d2 = nhk.f35619a.mo68390d();
            d2.mo68432a("nhk", "e", 453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Try getting audio from car audio policy");
            nxg nxg = nhk.f35631m;
            int i8 = nhk.f35620b;
            Object obj2 = nxg.f36857b;
            if (obj2 == null || (obj = nxg.f36858c) == null) {
                throw new IllegalStateException("Mixes not initialized");
            }
            if (i8 != 3) {
                obj2 = obj;
            }
            audioRecord = ((AudioPolicy) nxg.f36856a).createAudioRecordSink((AudioMix) obj2);
            if (audioRecord != null && audioRecord.getState() == 0) {
                bnsi c = nhk.f35619a.mo68388c();
                c.mo68432a("nhk", "e", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Audio record uninitialized");
                audioRecord = null;
            }
            if (audioRecord == null && i4 == 3) {
                bnsi d3 = nhk.f35619a.mo68390d();
                d3.mo68432a("nhk", "e", 460, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68405a("Second try with fixed volume. Capture only media stream.");
                audioRecord = nhk.mo20670a(i6, a);
            }
        } else {
            bnsi d4 = nhk.f35619a.mo68390d();
            d4.mo68432a("nhk", "e", 464, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("API level L or force single channel capturing");
            audioRecord = nhk.mo20670a(i6, a);
        }
        if (audioRecord == null || audioRecord.getState() == 0) {
            bnsi c2 = nhk.f35619a.mo68388c();
            c2.mo68432a("nhk", "e", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Failed to setup audio capture with new APIs.");
            if (i4 == 3) {
                bnsi c3 = nhk.f35619a.mo68388c();
                c3.mo68432a("nhk", "e", 473, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68405a("Trying remote submix for media stream");
                audioRecord = new AudioRecord(8, a, 12, 2, i6);
            } else {
                bnsi c4 = nhk.f35619a.mo68388c();
                c4.mo68432a("nhk", "e", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c4.mo68405a("Give up capturing for non-media stream");
                return;
            }
        }
        try {
            audioRecord.startRecording();
            nhk.f35627i.mo21307al();
            AudioManager audioManager = (AudioManager) nhk.f35632n.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            bnsi d5 = nhk.f35619a.mo68390d();
            d5.mo68432a("nhk", "e", 502, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d5.mo68409a("setting volume to %d", streamVolume);
            audioManager.setStreamVolume(3, streamVolume, 0);
            boolean z4 = false;
            boolean z5 = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (nhk.f35622d || z4) {
                    break;
                }
                int i11 = nhk.f35625g;
                int i12 = -1;
                if (i11 == 1) {
                    z = z4;
                    bnsi d6 = nhk.f35619a.mo68390d();
                    d6.mo68432a("nhk", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d6.mo68424a("focus gain, stream: %s, bh: %s", nhk.f35621c, njp.m26591d(nhk.f35626h.mo20645a()));
                    nhk.f35623e = true;
                    nhk.f35624f = nhk.f35626h;
                    nhk.f35624f.mo20647a(nhk.f35636r);
                } else if (i11 == 2) {
                    z = z4;
                    nhk.f35623e = false;
                    nxe nxe = nhk.f35624f;
                    bnsi d7 = nhk.f35619a.mo68390d();
                    d7.mo68432a("nhk", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    String str = nhk.f35621c;
                    if (nxe != null) {
                        i2 = nxe.mo20645a();
                    } else {
                        i2 = -1;
                    }
                    d7.mo68424a("focus loss, stream: %s, old bh: %s", str, njp.m26591d(i2));
                    if (nxe != null) {
                        nxe.mo20652a(false);
                    }
                    if (z5) {
                        nhk.f35630l.mo20699b(nhk.f35620b);
                    }
                    nhk.f35624f = null;
                } else if (i11 != i5) {
                    z = z4;
                } else {
                    nxe nxe2 = nhk.f35624f;
                    bnsi d8 = nhk.f35619a.mo68390d();
                    z = z4;
                    d8.mo68432a("nhk", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    String str2 = nhk.f35621c;
                    if (nxe2 != null) {
                        i3 = nxe2.mo20645a();
                    } else {
                        i3 = -1;
                    }
                    d8.mo68425a("switching BH for stream: %s, from BH: %s to BH %s", str2, njp.m26591d(i3), njp.m26591d(nhk.f35626h.mo20645a()));
                    if (nxe2 != null) {
                        nxe2.mo20652a(false);
                    }
                    nhk.f35623e = true;
                    nhk.f35626h.mo20647a(nhk.f35636r);
                    nhk.f35624f = nhk.f35626h;
                }
                if (i11 != 0) {
                    nhk.f35625g = 0;
                    synchronized (nhk) {
                        nhk.notifyAll();
                    }
                }
                if (nhk.f35623e && !z5) {
                    nhk.mo20682f();
                    nhk.f35624f.mo20645a();
                    nhk.f35624f.mo20652a(false);
                    nhk.f35623e = false;
                }
                if (nhk.f35623e) {
                    nwy = nhk.f35624f.mo20665j();
                    z2 = true;
                } else {
                    nwy = nhk.f35633o.mo21774a();
                    z2 = false;
                }
                int b = nwy.mo21773b();
                int a2 = nwy.mo21772a();
                while (true) {
                    if (nhk.f35622d || b <= 0) {
                        break;
                    }
                    int read = audioRecord.read(nwy.f36852b.array(), a2, b);
                    if (read < 0) {
                        bnsi c5 = nhk.f35619a.mo68388c();
                        c5.mo68432a("nhk", "e", 550, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c5.mo68413a("AudioRecord read returned %d, stream %s", read, (Object) nhk.f35621c);
                        z = true;
                        break;
                    }
                    a2 += read;
                    b -= read;
                }
                ByteBuffer byteBuffer = nwy.f36852b;
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int arrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
                int i13 = arrayOffset2 - arrayOffset;
                if (i13 <= 60) {
                    if (nhk.m26290a(array, arrayOffset, arrayOffset2)) {
                        i9 = 0;
                        if (i9 < 4) {
                            nwy.f36851a = SystemClock.elapsedRealtime() * 1000;
                            if (!ccsh.m131421b() || (!nhk.f35622d && !z)) {
                                if (z5) {
                                    z3 = true;
                                } else if (nhk.f35623e) {
                                    bnsi d9 = nhk.f35619a.mo68390d();
                                    d9.mo68432a("nhk", "e", 611, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d9.mo68420a("bottom half starts streaming for %s", nhk.f35621c);
                                    nhk.f35624f.mo20647a(nhk.f35636r);
                                    z3 = true;
                                    z5 = true;
                                    i10 = 0;
                                } else {
                                    nxe nxe3 = nhk.f35624f;
                                    if (nxe3 != null && nxe3.mo20662g() == nhk) {
                                        bnsi c6 = nhk.f35619a.mo68388c();
                                        c6.mo68432a("nhk", "e", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c6.mo68405a("previous session not released");
                                        nxe3.mo20652a(false);
                                    }
                                    bnsi d10 = nhk.f35619a.mo68390d();
                                    d10.mo68432a("nhk", "e", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d10.mo68420a("Requesting bottom half for %s", nhk.f35621c);
                                    nxe a3 = nhk.f35630l.mo20696a(nhk.f35620b);
                                    if (a3 != null) {
                                        nhk.f35624f = a3;
                                        bnsi d11 = nhk.f35619a.mo68390d();
                                        d11.mo68432a("nhk", "e", 624, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        d11.mo68420a("bottom half starts streaming for %s", nhk.f35621c);
                                        nhk.f35624f.mo20647a(nhk.f35636r);
                                        z3 = true;
                                        nhk.f35623e = true;
                                    } else {
                                        z3 = true;
                                    }
                                    nhk.f35633o.mo21778c();
                                    nhk.f35634p = z3;
                                    z5 = true;
                                    i10 = 0;
                                }
                                i10 += z3 ? 1 : 0;
                                if (nhk.f35623e) {
                                    nhk.mo20682f();
                                    nhk.f35624f.mo20656b(nwy);
                                    nhk.f35635q = SystemClock.elapsedRealtime();
                                } else {
                                    nhk.f35633o.mo21775a(nwy);
                                    if (nhk.f35633o.mo21779d() > nhk.f35639u) {
                                        nwz nwz = nhk.f35633o;
                                        synchronized (nwz) {
                                            nwy2 = (nwy) nwz.f36853a.poll();
                                        }
                                        if (nwy2 != null) {
                                            nwz.mo21777b(nwy2);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            if (z5) {
                                bnsi d12 = nhk.f35619a.mo68390d();
                                d12.mo68432a("nhk", "e", 569, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                String str3 = nhk.f35621c;
                                Integer valueOf = Integer.valueOf(i10);
                                if (nhk.f35623e) {
                                    i12 = nhk.f35624f.mo20645a();
                                }
                                d12.mo68425a("stopping streaming %s due to zero data, frames captured: %d, bh: %s", str3, valueOf, njp.m26591d(i12));
                                if (nhk.f35623e) {
                                    bnsi d13 = nhk.f35619a.mo68390d();
                                    d13.mo68432a("nhk", "e", 576, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d13.mo68405a("Stop stream and release bottom half");
                                    nhk.f35624f.mo20652a(false);
                                    nhk.f35623e = false;
                                    z5 = false;
                                } else {
                                    bnsi d14 = nhk.f35619a.mo68390d();
                                    d14.mo68432a("nhk", "e", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d14.mo68405a("Cancel bottom half request");
                                    nhk.f35630l.mo20700c(nhk.f35620b);
                                    z5 = false;
                                }
                            } else if (i9 >= nhk.f35639u && nhk.f35633o.mo21779d() > 0) {
                                bnsi d15 = nhk.f35619a.mo68390d();
                                d15.mo68432a("nhk", "e", 585, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d15.mo68405a("Cancel bottom half request and clear the system capture queue");
                                nhk.f35630l.mo20700c(nhk.f35620b);
                                nhk.f35633o.mo21778c();
                            }
                            if (!z2) {
                                nhk.f35633o.mo21777b(nwy);
                            } else {
                                nhk.f35624f.mo20650a(nwy);
                            }
                        }
                        z4 = z;
                        i5 = 3;
                    }
                } else if (nhk.m26290a(array, arrayOffset, 20) || nhk.m26290a(array, (i13 - 20) >> 1, 20) || nhk.m26290a(array, arrayOffset2 - 20, 20)) {
                    i9 = 0;
                    if (i9 < 4) {
                    }
                    z4 = z;
                    i5 = 3;
                }
                if (i9 < Integer.MAX_VALUE) {
                    i9++;
                }
                if (i9 < 4) {
                }
                z4 = z;
                i5 = 3;
            }
            bnsi c7 = nhk.f35619a.mo68388c();
            c7.mo68432a("nhk", "e", 603, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c7.mo68405a("Quit audio capture");
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
            if (nhk.f35638t) {
                ((AudioManager) nhk.f35632n.getSystemService("audio")).adjustStreamVolume(3, -100, 0);
            }
            if (nhk.f35623e) {
                bnsi d16 = nhk.f35619a.mo68390d();
                d16.mo68432a("nhk", "e", 664, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d16.mo68405a("Properly stop audio stream before shutdown");
                nhk.f35624f.mo20652a(ccsh.m131421b());
                nhk.f35623e = false;
            }
        } catch (IllegalStateException e) {
            bnsi b2 = nhk.f35619a.mo68387b();
            b2.mo68437a(e);
            b2.mo68432a("nhk", "e", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("This device does not support audio capturing.");
            nhk.f35628j.mo21273a(bpdn.CAR_SERVICE_INIT_ERROR, bpdo.NO_AUDIO_CAPTURE, "cannot capture audio");
        }
    }
}
