package p000;

import android.util.Log;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

/* renamed from: bwbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbi implements Runnable {

    /* renamed from: a */
    public static final String f158732a = bwbi.class.getSimpleName();

    /* renamed from: b */
    public final bwbe f158733b;

    /* renamed from: c */
    public final List f158734c;

    /* renamed from: d */
    public final ThreadFactory f158735d;

    /* renamed from: e */
    public final String f158736e;

    /* renamed from: f */
    public final String f158737f;

    /* renamed from: g */
    private final String f158738g;

    /* renamed from: h */
    private final RequestQueue f158739h;

    /* renamed from: i */
    private final String f158740i;

    /* renamed from: j */
    private final String f158741j;

    public bwbi(bwbe bwbe, List list, String str, RequestQueue requestQueue, String str2, String str3, String str4, String str5, ThreadFactory threadFactory) {
        this.f158733b = bwbe;
        this.f158734c = list;
        this.f158738g = str;
        this.f158739h = requestQueue;
        this.f158740i = str2;
        this.f158736e = str3;
        this.f158737f = str4;
        this.f158741j = str5;
        this.f158735d = threadFactory;
    }

    /* renamed from: a */
    static String m121720a(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(((bwbd) list.get(i)).mo73402a());
        }
        return bwaq.m121662a(strArr, ",");
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:143:0x033a */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r7.f158733b.mo73427a(5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0440, code lost:
        r7.f158733b.mo73427a(4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044a, code lost:
        r1 = r7.f158733b;
        r1.mo73437h();
        r1.mo73447r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        if (p000.bwam.m121655a(p000.bwbi.f158732a, 3) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r1 = java.lang.String.valueOf(r1);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 12);
        r3.append("Closing is: ");
        r3.append(r1);
        r3.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b0 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d8 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f6 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0343 A[Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333, all -> 0x036e }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x035e A[Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333, all -> 0x036e }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0375 A[SYNTHETIC, Splitter:B:158:0x0375] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03b2 A[Catch:{ SecurityException -> 0x0449, bwbk -> 0x043f, IOException -> 0x0436, all -> 0x042c }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x042c A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x043f A[Catch:{ IOException -> 0x0379, SecurityException -> 0x0449, bwbk -> 0x043f, all -> 0x042c, all -> 0x045f }, ExcHandler: bwbk (r0v2 'e' bwbk A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0449 A[Catch:{ IOException -> 0x0379, SecurityException -> 0x0449, bwbk -> 0x043f, all -> 0x042c, all -> 0x045f }, ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a1 A[SYNTHETIC] */
    public final void run() {
        Throwable th;
        ExecutionException executionException;
        IOException iOException;
        ArrayList arrayList;
        int i;
        IOException iOException2;
        RuntimeException runtimeException;
        while (this.f158733b.mo73436g() && !this.f158734c.isEmpty()) {
            try {
                long j = this.f158733b.mo73439j();
                if (j > 0) {
                    try {
                        synchronized (this) {
                            wait(j);
                        }
                    } catch (InterruptedException e) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int size = this.f158734c.size();
                    if (this.f158733b.mo73438i()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        if (this.f158734c.isEmpty() || !(this.f158734c.get(0) instanceof bwbb)) {
                            this.f158734c.add(0, this.f158733b.f158698b);
                        }
                        dataOutputStream.writeShort(23);
                        dataOutputStream.writeLong(this.f158733b.mo73441l());
                        dataOutputStream.writeUTF(this.f158738g);
                        dataOutputStream.writeUTF(this.f158736e);
                        dataOutputStream.writeUTF(this.f158737f);
                        dataOutputStream.writeUTF(this.f158741j);
                        for (bwbd bwbd : this.f158734c) {
                            dataOutputStream.writeByte(bwbd.mo73402a());
                            bwbd.mo73403a(dataOutputStream);
                        }
                        dataOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bwbj bwbj = new bwbj(this.f158734c);
                        RequestFuture newFuture = RequestFuture.newFuture();
                        byte[] bArr = byteArray;
                        bwbh bwbh = new bwbh(this, bArr, bwbj, this.f158740i, newFuture);
                        bwbh.setShouldCache(false);
                        this.f158739h.add(bwbh);
                        DataInputStream dataInputStream = null;
                        bwbd bwbd2 = null;
                        try {
                            byte[] bArr2 = (byte[]) newFuture.get();
                            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr2));
                            try {
                                if (dataInputStream2.readUnsignedShort() == 23) {
                                    arrayList = new ArrayList();
                                    i = 0;
                                    while (i < this.f158734c.size()) {
                                        try {
                                            bwbd bwbd3 = (bwbd) this.f158734c.get(i);
                                            try {
                                                bwbe bwbe = this.f158733b;
                                                if (bwam.m121655a(f158732a, 3)) {
                                                    String valueOf = String.valueOf(bwbd3);
                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                                                    sb.append("Processing DataRequest: ");
                                                    sb.append(valueOf);
                                                    sb.toString();
                                                }
                                                int readUnsignedByte = dataInputStream2.readUnsignedByte();
                                                if (readUnsignedByte != bwbd3.mo73402a()) {
                                                    if (bwam.m121655a(f158732a, 3)) {
                                                        Object[] objArr = {Integer.valueOf(bwbd3.mo73402a()), Integer.valueOf(readUnsignedByte)};
                                                    }
                                                    int a = bwbd3.mo73402a();
                                                    StringBuilder sb2 = new StringBuilder(39);
                                                    sb2.append("RequestType: ");
                                                    sb2.append(readUnsignedByte);
                                                    sb2.append(" != ");
                                                    sb2.append(a);
                                                    throw new IOException(sb2.toString());
                                                }
                                                if (bwbd3.mo73404a(dataInputStream2)) {
                                                    Iterator it = bwbe.f158700d.iterator();
                                                    while (it.hasNext()) {
                                                        ((bwav) it.next()).mo34774b(bwbd3);
                                                    }
                                                } else {
                                                    arrayList.add(bwbd3);
                                                }
                                                i++;
                                                bwbd2 = bwbd3;
                                            } catch (IOException e2) {
                                                iOException2 = e2;
                                                bwbd2 = bwbd3;
                                                if (bwam.m121655a(f158732a, 6)) {
                                                }
                                                if (iOException2 instanceof EOFException) {
                                                }
                                                throw iOException2;
                                            } catch (RuntimeException e3) {
                                                runtimeException = e3;
                                                bwbd2 = bwbd3;
                                                if (bwam.m121655a(f158732a, 6)) {
                                                }
                                                throw runtimeException;
                                            }
                                        } catch (IOException e4) {
                                            iOException2 = e4;
                                            if (bwam.m121655a(f158732a, 6)) {
                                                String str = f158732a;
                                                int a2 = bwbd2.mo73402a();
                                                StringBuilder sb3 = new StringBuilder(24);
                                                sb3.append("IOException: ");
                                                sb3.append(a2);
                                                Log.e(str, sb3.toString());
                                            }
                                            if (iOException2 instanceof EOFException) {
                                                bwbd2.mo73419e();
                                            }
                                            throw iOException2;
                                        } catch (RuntimeException e5) {
                                            runtimeException = e5;
                                            if (bwam.m121655a(f158732a, 6)) {
                                                String str2 = f158732a;
                                                int a3 = bwbd2.mo73402a();
                                                StringBuilder sb4 = new StringBuilder(29);
                                                sb4.append("RunTimeException: ");
                                                sb4.append(a3);
                                                Log.e(str2, sb4.toString());
                                            }
                                            throw runtimeException;
                                        }
                                    }
                                    if (i < this.f158734c.size()) {
                                        List list = this.f158734c;
                                        arrayList.addAll(list.subList(i, list.size()));
                                    }
                                    this.f158734c.clear();
                                    this.f158734c.addAll(arrayList);
                                    bwbj.mo73450a(byteArray.length, bArr2.length);
                                    dataInputStream2.close();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (bwbd bwbd4 : this.f158734c) {
                                        if (!bwbd4.mo73418d()) {
                                            if (bwam.m121655a(f158732a, 3)) {
                                                String valueOf2 = String.valueOf(bwbd4);
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                                                sb5.append("Error processing: ");
                                                sb5.append(valueOf2);
                                                sb5.append(" not retrying");
                                                sb5.toString();
                                            }
                                            this.f158733b.mo73431b(bwbd4);
                                        } else {
                                            if (bwam.m121655a(f158732a, 3)) {
                                                String valueOf3 = String.valueOf(bwbd4);
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 10);
                                                sb6.append("Retrying: ");
                                                sb6.append(valueOf3);
                                                sb6.toString();
                                            }
                                            arrayList2.add(bwbd4);
                                        }
                                    }
                                    this.f158734c.clear();
                                    this.f158734c.addAll(arrayList2);
                                    if (this.f158734c.size() != size) {
                                        this.f158733b.mo73440k();
                                    } else {
                                        int size2 = this.f158734c.size();
                                        StringBuilder sb7 = new StringBuilder(39);
                                        sb7.append("No requests were processed: ");
                                        sb7.append(size2);
                                        throw new IOException(sb7.toString());
                                    }
                                } else {
                                    this.f158733b.mo73447r();
                                    throw new IOException("Protocol version mismatch with the server");
                                }
                            } catch (ExecutionException e6) {
                                executionException = e6;
                                VolleyError volleyError = (VolleyError) executionException.getCause();
                                if (bwam.m121655a(f158732a, 5)) {
                                }
                                throw volleyError.getCause();
                            } catch (IOException e7) {
                                iOException = e7;
                                bArr = dataInputStream2;
                                if (bwam.m121655a(f158732a, 5)) {
                                }
                                throw iOException;
                            } catch (Throwable th3) {
                                th = th3;
                                dataInputStream = dataInputStream2;
                                if (dataInputStream != null) {
                                }
                                ArrayList arrayList3 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                this.f158734c.clear();
                                this.f158734c.addAll(arrayList3);
                                throw th;
                            }
                        } catch (ExecutionException e8) {
                            executionException = e8;
                            VolleyError volleyError2 = (VolleyError) executionException.getCause();
                            if (bwam.m121655a(f158732a, 5)) {
                                Log.w(f158732a, "Exception when executing the requests", volleyError2.getCause());
                            }
                            throw volleyError2.getCause();
                        } catch (IOException e9) {
                            bArr = null;
                            iOException = e9;
                            if (bwam.m121655a(f158732a, 5)) {
                                Log.w(f158732a, "Exception when processing the responses", iOException);
                            }
                            throw iOException;
                        } catch (Throwable th4) {
                            th = th4;
                            dataInputStream = bArr;
                            if (dataInputStream != null) {
                            }
                            ArrayList arrayList32 = new ArrayList();
                            while (r3.hasNext()) {
                            }
                            this.f158734c.clear();
                            this.f158734c.addAll(arrayList32);
                            throw th;
                        }
                    } else {
                        throw new IOException("DataRequestDispatcher network disabled.");
                    }
                } catch (SecurityException e10) {
                } catch (bwbk e11) {
                } catch (IOException e12) {
                    this.f158733b.mo73427a(3, e12);
                } catch (Throwable th5) {
                }
            } catch (IOException e13) {
                IOException iOException3 = e13;
                if (bwam.m121655a(f158732a, 3)) {
                    String valueOf4 = String.valueOf(iOException3);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf4).length() + 12);
                    sb8.append("Closing is: ");
                    sb8.append(valueOf4);
                    sb8.toString();
                }
            } catch (SecurityException e102) {
            } catch (bwbk e112) {
            } catch (Throwable th6) {
                Throwable th7 = th6;
                this.f158733b.mo73430b();
                this.f158733b.mo73433d();
                throw th7;
            }
        }
        this.f158733b.mo73430b();
        this.f158733b.mo73433d();
    }
}
