package p000;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: avb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avb {

    /* renamed from: a */
    final C1245ok f2350a;

    /* renamed from: b */
    final C1245ok f2351b;

    /* renamed from: c */
    final C1245ok f2352c;

    public avb(C1245ok okVar, C1245ok okVar2, C1245ok okVar3) {
        this.f2350a = okVar;
        this.f2351b = okVar2;
        this.f2352c = okVar3;
    }

    /* renamed from: a */
    private final Class m2155a(Class cls) {
        Class cls2 = (Class) this.f2352c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f2352c.put(cls.getName(), cls3);
        return cls3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2668a(int i);

    /* renamed from: a */
    public abstract void mo2670a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2671a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2672a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2676a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2678a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2680a(boolean z);

    /* renamed from: a */
    public void mo2682a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    public abstract void mo2683a(byte[] bArr);

    /* renamed from: a */
    public boolean mo2685a() {
        return false;
    }

    /* renamed from: b */
    public final int mo2686b(int i, int i2) {
        return mo2692b(i2) ? mo2697d() : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo2691b();

    /* renamed from: b */
    public abstract boolean mo2692b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract avb mo2695c();

    /* renamed from: c */
    public abstract void mo2696c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo2697d();

    /* renamed from: e */
    public abstract long mo2698e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo2699f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract IBinder mo2700g();

    /* renamed from: h */
    public abstract byte[] mo2701h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract CharSequence mo2702i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Parcelable mo2703j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo2704k();

    /* renamed from: l */
    public final avg mo2705l() {
        String f = mo2699f();
        if (f == null) {
            return null;
        }
        avb c = mo2695c();
        try {
            Method method = (Method) this.f2350a.get(f);
            if (method == null) {
                method = Class.forName(f, true, avb.class.getClassLoader()).getDeclaredMethod("read", avb.class);
                this.f2350a.put(f, method);
            }
            return (avg) method.invoke(null, c);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public final void mo2669a(int i, int i2) {
        mo2696c(i2);
        mo2668a(i);
    }

    /* renamed from: b */
    public final Parcelable mo2687b(Parcelable parcelable, int i) {
        return mo2692b(i) ? mo2703j() : parcelable;
    }

    /* renamed from: a */
    public final void mo2673a(Parcelable parcelable, int i) {
        mo2696c(i);
        mo2672a(parcelable);
    }

    /* renamed from: a */
    public final void mo2674a(avg avg) {
        if (avg != null) {
            try {
                mo2678a(m2155a(avg.getClass()).getName());
                avb c = mo2695c();
                try {
                    Class<?> cls = avg.getClass();
                    Method method = (Method) this.f2351b.get(cls.getName());
                    if (method == null) {
                        method = m2155a(cls).getDeclaredMethod("write", cls, avb.class);
                        this.f2351b.put(cls.getName(), method);
                    }
                    method.invoke(null, avg, c);
                    c.mo2691b();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(avg.getClass().getSimpleName() + " does not have a Parcelizer", e5);
            }
        } else {
            mo2678a((String) null);
        }
    }

    /* renamed from: b */
    public final avg mo2688b(avg avg, int i) {
        return mo2692b(i) ? mo2705l() : avg;
    }

    /* renamed from: b */
    public final CharSequence mo2689b(CharSequence charSequence, int i) {
        return mo2692b(i) ? mo2702i() : charSequence;
    }

    /* renamed from: b */
    public final String mo2690b(String str, int i) {
        return mo2692b(i) ? mo2699f() : str;
    }

    /* renamed from: b */
    public final boolean mo2693b(boolean z, int i) {
        return mo2692b(i) ? mo2704k() : z;
    }

    /* renamed from: b */
    public final Object[] mo2694b(Object[] objArr, int i) {
        Serializable serializable;
        if (!mo2692b(i)) {
            return objArr;
        }
        int d = mo2697d();
        if (d < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(d);
        if (d != 0) {
            int d2 = mo2697d();
            if (d2 == 1) {
                while (d > 0) {
                    arrayList.add(mo2705l());
                    d--;
                }
            } else if (d2 == 2) {
                while (d > 0) {
                    arrayList.add(mo2703j());
                    d--;
                }
            } else if (d2 == 3) {
                while (d > 0) {
                    String f = mo2699f();
                    if (f != null) {
                        try {
                            serializable = (Serializable) new auz(new ByteArrayInputStream(mo2701h())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + f + ")", e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + f + ")", e2);
                        }
                    } else {
                        serializable = null;
                    }
                    arrayList.add(serializable);
                    d--;
                }
            } else if (d2 == 4) {
                while (d > 0) {
                    arrayList.add(mo2699f());
                    d--;
                }
            } else if (d2 == 5) {
                while (d > 0) {
                    arrayList.add(mo2700g());
                    d--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    /* renamed from: a */
    public final void mo2675a(avg avg, int i) {
        mo2696c(i);
        mo2674a(avg);
    }

    /* renamed from: a */
    public final void mo2677a(CharSequence charSequence, int i) {
        mo2696c(i);
        mo2676a(charSequence);
    }

    /* renamed from: a */
    public final void mo2679a(String str, int i) {
        mo2696c(i);
        mo2678a(str);
    }

    /* renamed from: a */
    public final void mo2681a(boolean z, int i) {
        mo2696c(i);
        mo2680a(z);
    }

    /* renamed from: a */
    public final void mo2684a(Object[] objArr, int i) {
        int i2;
        mo2696c(i);
        if (objArr != null) {
            int length = objArr.length;
            mo2668a(length);
            if (length > 0) {
                int i3 = 0;
                Object obj = objArr[0];
                if (obj instanceof String) {
                    i2 = 4;
                } else if (obj instanceof Parcelable) {
                    i2 = 2;
                } else if (obj instanceof avg) {
                    i2 = 1;
                } else if (obj instanceof Serializable) {
                    i2 = 3;
                } else if (obj instanceof IBinder) {
                    i2 = 5;
                } else if (obj instanceof Integer) {
                    i2 = 7;
                } else if (obj instanceof Float) {
                    i2 = 8;
                } else {
                    throw new IllegalArgumentException(obj.getClass().getName() + " cannot be VersionedParcelled");
                }
                mo2668a(i2);
                if (i2 == 1) {
                    while (i3 < length) {
                        mo2674a((avg) objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 2) {
                    while (i3 < length) {
                        mo2672a((Parcelable) objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 3) {
                    while (i3 < length) {
                        Serializable serializable = (Serializable) objArr[i3];
                        if (serializable == null) {
                            mo2678a((String) null);
                        } else {
                            String name = serializable.getClass().getName();
                            mo2678a(name);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(serializable);
                                objectOutputStream.close();
                                mo2683a(byteArrayOutputStream.toByteArray());
                            } catch (IOException e) {
                                throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
                            }
                        }
                        i3++;
                    }
                } else if (i2 == 4) {
                    while (i3 < length) {
                        mo2678a((String) objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 5) {
                    while (i3 < length) {
                        mo2671a((IBinder) objArr[i3]);
                        i3++;
                    }
                }
            }
        } else {
            mo2668a(-1);
        }
    }
}
