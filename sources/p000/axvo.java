package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.selector.NativeOsCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: axvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvo extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvr f96489a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvo(axvr axvr) {
        super(axvr);
        this.f96489a = axvr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d9 A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01da A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f4 A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f5 A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021c A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021d A[Catch:{ axvv -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0250 A[Catch:{ ayff -> 0x02a2, axvv -> 0x02be }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0251 A[Catch:{ ayff -> 0x02a2, axvv -> 0x02be }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0283 A[Catch:{ ayff -> 0x02a2, axvv -> 0x02be }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0292 A[Catch:{ ayff -> 0x02a2, axvv -> 0x02be }] */
    /* renamed from: a */
    public final void mo53610a() {
        Set<ParcelFileDescriptor> set;
        axvv axvv;
        int a;
        boolean z;
        bxvd da;
        bxvd da2;
        bxvd bxvd;
        short[] sArr;
        int i = 2;
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running selector.");
        }
        boolean z2 = false;
        try {
            ayfj ayfj = this.f96489a.f96495b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sdo.m34971a(!((ayfk) ayfj).f97483c, (Object) "should not call select() after close()");
            sdo.m34974b(true);
            sdo.m34959a(timeUnit);
            int i2 = 1;
            for (ayfi ayfi : ((ayfk) ayfj).f97481a.values()) {
                if (ayfi != ayfi.NONE) {
                    i2++;
                }
            }
            ayfl[] ayflArr = new ayfl[i2];
            ayflArr[0] = ayfk.m83917c(((ayfk) ayfj).f97482b[0]);
            int i3 = 1;
            for (Map.Entry entry : ((ayfk) ayfj).f97481a.entrySet()) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) entry.getKey();
                ayfi ayfi2 = ayfi.NONE;
                int ordinal = ((ayfi) entry.getValue()).ordinal();
                if (ordinal == 1) {
                    int i4 = i3 + 1;
                    ayflArr[i3] = ayfk.m83917c(parcelFileDescriptor);
                    i3 = i4;
                } else if (ordinal == 2) {
                    ayfl ayfl = new ayfl();
                    ayfl.f97486a = parcelFileDescriptor;
                    ayfl.f97487b = 2;
                    ayflArr[i3] = ayfl;
                    i3++;
                }
            }
            try {
                int millis = (int) timeUnit.toMillis(900);
                sdo.m34959a(ayflArr);
                int[] iArr = new int[i2];
                short[] sArr2 = new short[i2];
                sArr = new short[i2];
                for (int i5 = 0; i5 < i2; i5++) {
                    ayfl ayfl2 = ayflArr[i5];
                    sdo.m34959a(ayfl2);
                    sdo.m34959a(ayfl2.f97486a);
                    iArr[i5] = ayfl2.f97486a.getFd();
                    sArr2[i5] = ayfl2.f97487b;
                    sArr[i5] = 0;
                }
                int nativePoll = NativeOsCompat.nativePoll(iArr, sArr2, sArr, millis);
                NativeOsCompat.m94431a(nativePoll, "poll");
                for (int i6 = 0; i6 < i2; i6++) {
                    ayflArr[i6].f97488c = sArr[i6];
                }
                if (nativePoll != 0) {
                    HashSet a2 = bnpf.m110048a(nativePoll);
                    for (int i7 = 0; i7 < i2; i7++) {
                        ayfl ayfl3 = ayflArr[i7];
                        if (ayfl3.f97488c != 0) {
                            ParcelFileDescriptor parcelFileDescriptor2 = ayfl3.f97486a;
                            if (parcelFileDescriptor2 != ((ayfk) ayfj).f97482b[0]) {
                                a2.add(parcelFileDescriptor2);
                            } else {
                                ((ayfk) ayfj).mo53976c();
                            }
                        }
                    }
                    set = Collections.unmodifiableSet(a2);
                    for (ParcelFileDescriptor parcelFileDescriptor3 : set) {
                        Map map = this.f96489a.f96496c.f96492a;
                        sdo.m34959a(parcelFileDescriptor3);
                        axvz axvz = (axvz) map.get(parcelFileDescriptor3);
                        if (axvz != null) {
                            axvx axvx = (axvx) this.f96489a.f96497d.mo53628a(axvz);
                            if (axvx != null) {
                                this.f96486g = axvx;
                                sdo.m34959a(parcelFileDescriptor3);
                                if (parcelFileDescriptor3 == axvx.f96523k) {
                                    if (axvx.f96519g == 10 && axvx.f96525m != null) {
                                        while (true) {
                                            try {
                                                a = axvx.mo53633a(axvx.f96523k, axvx.f96525m);
                                                if (a <= 0) {
                                                    break;
                                                }
                                                i = 2;
                                                z2 = false;
                                            } catch (ayff e) {
                                                throw new IllegalStateException("Failed to do non-blocking write", e);
                                            } catch (axvv e2) {
                                                e = e2;
                                                axvv = e;
                                                mo53612a(axvv.f96511a);
                                                this.f96486g = null;
                                                i = 2;
                                                z2 = false;
                                            }
                                        }
                                        if (a == -1) {
                                            try {
                                                if (Log.isLoggable("ChannelStateMachine", i)) {
                                                    String valueOf = String.valueOf(axvx.f96513a);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                                                    sb.append("Client closed input stream for channel: ");
                                                    sb.append(valueOf);
                                                    Log.v("ChannelStateMachine", sb.toString());
                                                }
                                            } catch (axvv e3) {
                                                axvv = e3;
                                                mo53612a(axvv.f96511a);
                                                this.f96486g = null;
                                                i = 2;
                                                z2 = false;
                                            }
                                        }
                                        try {
                                            if (!axvx.f96525m.hasRemaining() || a == -1) {
                                                if (a != -1) {
                                                    if (!axvx.f96526n) {
                                                        z = false;
                                                        long j = axvx.f96521i;
                                                        da = ayej.f97310d.mo74144da();
                                                        if (!da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = z2;
                                                        }
                                                        ayej ayej = (ayej) da.f164949b;
                                                        ayej.f97312a |= i;
                                                        ayej.f97314c = z;
                                                        da2 = ayek.f97315e.mo74144da();
                                                        if (!da2.f164950c) {
                                                            da2.mo74035c();
                                                            da2.f164950c = z2;
                                                        }
                                                        ayek ayek = (ayek) da2.f164949b;
                                                        int i8 = ayek.f97317a | 4;
                                                        ayek.f97317a = i8;
                                                        ayek.f97320d = j;
                                                        axvz axvz2 = axvx.f96513a;
                                                        long j2 = axvz2.f96541c;
                                                        int i9 = i8 | 1;
                                                        ayek.f97317a = i9;
                                                        ayek.f97318b = j2;
                                                        boolean z3 = axvz2.f96542d;
                                                        ayek.f97317a = i9 | 2;
                                                        ayek.f97319c = z3;
                                                        if (!da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        ayej ayej2 = (ayej) da.f164949b;
                                                        ayek ayek2 = (ayek) da2.mo74062i();
                                                        ayek2.getClass();
                                                        ayej2.f97313b = ayek2;
                                                        ayej2.f97312a |= 1;
                                                        ayej ayej3 = (ayej) da.mo74062i();
                                                        ayen i10 = axvx.mo53652i();
                                                        bxvd = (bxvd) i10.mo74142c(5);
                                                        bxvd.mo73625a((GeneratedMessageLite) i10);
                                                        if (!bxvd.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd.f164950c = false;
                                                        }
                                                        ayen ayen = (ayen) bxvd.f164949b;
                                                        ayen ayen2 = ayen.f97331g;
                                                        ayej3.getClass();
                                                        ayen.f97338f = ayej3;
                                                        ayen.f97333a |= 16;
                                                        axvx.f96529q.mo53766a(new aybg(axvx.f96513a, (ayen) bxvd.mo74062i()));
                                                        axvx.f96521i++;
                                                        if (z) {
                                                            axvx.f96515c.mo53617a(axvx.f96523k, ayfi.NONE);
                                                            axvx.mo53640b(9);
                                                        } else {
                                                            axvx.mo53641b(0, 0);
                                                        }
                                                        axvx.f96525m.clear();
                                                    }
                                                }
                                                z = true;
                                                long j3 = axvx.f96521i;
                                                da = ayej.f97310d.mo74144da();
                                                if (!da.f164950c) {
                                                }
                                                ayej ayej4 = (ayej) da.f164949b;
                                                ayej4.f97312a |= i;
                                                ayej4.f97314c = z;
                                                da2 = ayek.f97315e.mo74144da();
                                                if (!da2.f164950c) {
                                                }
                                                ayek ayek3 = (ayek) da2.f164949b;
                                                int i82 = ayek3.f97317a | 4;
                                                ayek3.f97317a = i82;
                                                ayek3.f97320d = j3;
                                                axvz axvz22 = axvx.f96513a;
                                                long j22 = axvz22.f96541c;
                                                int i92 = i82 | 1;
                                                ayek3.f97317a = i92;
                                                ayek3.f97318b = j22;
                                                boolean z32 = axvz22.f96542d;
                                                ayek3.f97317a = i92 | 2;
                                                ayek3.f97319c = z32;
                                                if (!da.f164950c) {
                                                }
                                                ayej ayej22 = (ayej) da.f164949b;
                                                ayek ayek22 = (ayek) da2.mo74062i();
                                                ayek22.getClass();
                                                ayej22.f97313b = ayek22;
                                                ayej22.f97312a |= 1;
                                                ayej ayej32 = (ayej) da.mo74062i();
                                                ayen i102 = axvx.mo53652i();
                                                bxvd = (bxvd) i102.mo74142c(5);
                                                bxvd.mo73625a((GeneratedMessageLite) i102);
                                                if (!bxvd.f164950c) {
                                                }
                                                ayen ayen3 = (ayen) bxvd.f164949b;
                                                ayen ayen22 = ayen.f97331g;
                                                ayej32.getClass();
                                                ayen3.f97338f = ayej32;
                                                ayen3.f97333a |= 16;
                                                axvx.f96529q.mo53766a(new aybg(axvx.f96513a, (ayen) bxvd.mo74062i()));
                                                axvx.f96521i++;
                                                if (z) {
                                                }
                                                axvx.f96525m.clear();
                                            }
                                        } catch (axvv e4) {
                                            e = e4;
                                            axvv = e;
                                            mo53612a(axvv.f96511a);
                                            this.f96486g = null;
                                            i = 2;
                                            z2 = false;
                                        }
                                    }
                                } else if (parcelFileDescriptor3 != axvx.f96524l) {
                                    Log.w("ChannelStateMachine", "doNonBlockingIo called with unknown key");
                                } else {
                                    axvx.mo53639b();
                                }
                                this.f96486g = null;
                                i = 2;
                                z2 = false;
                            } else {
                                Log.w("ChannelManager", "Selector has a reference to a non-existent channel");
                                throw new IllegalStateException("Selector has a reference to a non-existent channel");
                            }
                        } else {
                            throw new IllegalStateException("Untracked fd returned from selector");
                        }
                    }
                    if (Log.isLoggable("ChannelManager", 2)) {
                        Log.v("ChannelManager", "selector runnable finished.");
                        return;
                    }
                    return;
                }
                throw new TimeoutException();
            } catch (ayff e5) {
                Log.w("Selector", "error within poll()", e5);
                set = Collections.emptySet();
            } catch (Throwable th) {
                Throwable th2 = th;
                for (int i11 = 0; i11 < i2; i11++) {
                    ayflArr[i11].f97488c = sArr[i11];
                }
                throw th2;
            }
        } catch (TimeoutException e6) {
            TimeoutException timeoutException = e6;
            if (Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", "select timed out after 900 seconds", timeoutException);
            }
        } catch (RuntimeException e7) {
            RuntimeException runtimeException = e7;
            Log.w("ChannelManager", "Unexpected exception in SelectorRunnable. Cleaning up.", runtimeException);
            try {
                this.f96487h = false;
                mo53613b();
            } catch (RuntimeException e8) {
                Log.w("ChannelManager", "Wasn't able to clean up.", runtimeException);
            }
        }
    }
}
