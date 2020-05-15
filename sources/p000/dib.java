package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: dib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dib extends Binder {

    /* renamed from: a */
    private final String f13201a;

    /* renamed from: b */
    private final Context f13202b;

    /* renamed from: c */
    private int f13203c = dfq.m8314a().mo8865d();

    /* renamed from: d */
    private boolean f13204d = false;

    public dib(Context context, String str) {
        this.f13201a = str;
        this.f13202b = context;
    }

    /* renamed from: a */
    public static void m8553a(Parcel parcel, int i) {
        parcel.setDataSize(i);
        int dataSize = (parcel.dataSize() - parcel.dataPosition()) / 8;
        for (int i2 = 0; i2 < dataSize; i2++) {
            parcel.writeLong(0);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        BufferedReader bufferedReader;
        if (Binder.getCallingPid() != Process.myPid()) {
            synchronized (this) {
                if (dfq.m8314a().mo8866e()) {
                    if (!this.f13204d) {
                        File file = new File(this.f13202b.getFilesDir(), "binder_buffer_size.txt");
                        int i4 = this.f13203c;
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file));
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                Log.w("ChimeraSrvcProxy", "Failed to read the buffer size file. Using default NullBinder reply size.");
                            } else {
                                int parseInt = Integer.parseInt(readLine);
                                if (parseInt > i4) {
                                    bufferedReader.close();
                                    i4 = parseInt;
                                    this.f13203c = i4;
                                    this.f13204d = true;
                                }
                            }
                            bufferedReader.close();
                        } catch (IOException | NumberFormatException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
                            sb.append("Failed to read the buffer size file. Using default NullBinder reply size. ");
                            sb.append(valueOf);
                            Log.w("ChimeraSrvcProxy", sb.toString());
                        } catch (Throwable th) {
                            bqye.m113761a(th, th);
                        }
                        this.f13203c = i4;
                        this.f13204d = true;
                    }
                }
                i3 = this.f13203c;
            }
            parcel2.writeException(new IllegalStateException("Service without Chimera impl"));
            try {
                m8553a(parcel2, i3 * 1024);
                String str = this.f13201a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
                sb2.append("NullBinder for ");
                sb2.append(str);
                sb2.append(" triggering remote TransactionTooLargeException due to Service without Chimera impl");
                Log.i("ChimeraSrvcProxy", sb2.toString());
            } catch (OutOfMemoryError e2) {
                Log.w("ChimeraSrvcProxy", "OOM allocating NullBinder reply");
            }
            return true;
        }
        String str2 = this.f13201a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 76);
        sb3.append("NullBinder for ");
        sb3.append(str2);
        sb3.append(" throwing RemoteException due to Service without Chimera impl");
        Log.i("ChimeraSrvcProxy", sb3.toString());
        int i5 = Build.VERSION.SDK_INT;
        throw new RemoteException("Service without Chimera impl");
        throw th;
    }

    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}
