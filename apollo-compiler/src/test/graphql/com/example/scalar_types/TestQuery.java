package com.example.scalar_types;

import com.apollographql.apollo.api.Field;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.internal.Optional;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class TestQuery implements Query<TestQuery.Data, Optional<TestQuery.Data>, Operation.Variables> {
  public static final String OPERATION_DEFINITION = "";

  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;

  private static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "TestQuery";
    }
  };

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Optional<TestQuery.Data> wrapData(TestQuery.Data data) {
    return Optional.fromNullable(data);
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<TestQuery.Data> responseFieldMapper() {
    return new Data.Mapper();
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public OperationName name() {
    return OPERATION_NAME;
  }

  public static final class Builder {
    Builder() {
    }

    public TestQuery build() {
      return new TestQuery();
    }
  }

  public static class Data implements Operation.Data {
    private final Optional<String> graphQlString;

    private final Optional<String> graphQlIdNullable;

    private final @Nonnull String graphQlIdNonNullable;

    private final Optional<Integer> graphQlIntNullable;

    private final int graphQlIntNonNullable;

    private final Optional<Double> graphQlFloatNullable;

    private final double graphQlFloatNonNullable;

    private final Optional<Boolean> graphQlBooleanNullable;

    private final boolean graphQlBooleanNonNullable;

    private final Optional<List<Integer>> graphQlListOfInt;

    private final Optional<List<GraphQlListOfObject>> graphQlListOfObjects;

    private volatile String $toString;

    private volatile int $hashCode;

    private volatile boolean $hashCodeMemoized;

    public Data(@Nullable String graphQlString, @Nullable String graphQlIdNullable,
        @Nonnull String graphQlIdNonNullable, @Nullable Integer graphQlIntNullable,
        int graphQlIntNonNullable, @Nullable Double graphQlFloatNullable,
        double graphQlFloatNonNullable, @Nullable Boolean graphQlBooleanNullable,
        boolean graphQlBooleanNonNullable, @Nullable List<Integer> graphQlListOfInt,
        @Nullable List<GraphQlListOfObject> graphQlListOfObjects) {
      this.graphQlString = Optional.fromNullable(graphQlString);
      this.graphQlIdNullable = Optional.fromNullable(graphQlIdNullable);
      this.graphQlIdNonNullable = graphQlIdNonNullable;
      this.graphQlIntNullable = Optional.fromNullable(graphQlIntNullable);
      this.graphQlIntNonNullable = graphQlIntNonNullable;
      this.graphQlFloatNullable = Optional.fromNullable(graphQlFloatNullable);
      this.graphQlFloatNonNullable = graphQlFloatNonNullable;
      this.graphQlBooleanNullable = Optional.fromNullable(graphQlBooleanNullable);
      this.graphQlBooleanNonNullable = graphQlBooleanNonNullable;
      this.graphQlListOfInt = Optional.fromNullable(graphQlListOfInt);
      this.graphQlListOfObjects = Optional.fromNullable(graphQlListOfObjects);
    }

    public Optional<String> graphQlString() {
      return this.graphQlString;
    }

    public Optional<String> graphQlIdNullable() {
      return this.graphQlIdNullable;
    }

    public @Nonnull String graphQlIdNonNullable() {
      return this.graphQlIdNonNullable;
    }

    public Optional<Integer> graphQlIntNullable() {
      return this.graphQlIntNullable;
    }

    public int graphQlIntNonNullable() {
      return this.graphQlIntNonNullable;
    }

    public Optional<Double> graphQlFloatNullable() {
      return this.graphQlFloatNullable;
    }

    public double graphQlFloatNonNullable() {
      return this.graphQlFloatNonNullable;
    }

    public Optional<Boolean> graphQlBooleanNullable() {
      return this.graphQlBooleanNullable;
    }

    public boolean graphQlBooleanNonNullable() {
      return this.graphQlBooleanNonNullable;
    }

    public Optional<List<Integer>> graphQlListOfInt() {
      return this.graphQlListOfInt;
    }

    public Optional<List<GraphQlListOfObject>> graphQlListOfObjects() {
      return this.graphQlListOfObjects;
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "graphQlString=" + graphQlString + ", "
          + "graphQlIdNullable=" + graphQlIdNullable + ", "
          + "graphQlIdNonNullable=" + graphQlIdNonNullable + ", "
          + "graphQlIntNullable=" + graphQlIntNullable + ", "
          + "graphQlIntNonNullable=" + graphQlIntNonNullable + ", "
          + "graphQlFloatNullable=" + graphQlFloatNullable + ", "
          + "graphQlFloatNonNullable=" + graphQlFloatNonNullable + ", "
          + "graphQlBooleanNullable=" + graphQlBooleanNullable + ", "
          + "graphQlBooleanNonNullable=" + graphQlBooleanNonNullable + ", "
          + "graphQlListOfInt=" + graphQlListOfInt + ", "
          + "graphQlListOfObjects=" + graphQlListOfObjects
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return this.graphQlString.equals(that.graphQlString)
         && this.graphQlIdNullable.equals(that.graphQlIdNullable)
         && this.graphQlIdNonNullable.equals(that.graphQlIdNonNullable)
         && this.graphQlIntNullable.equals(that.graphQlIntNullable)
         && this.graphQlIntNonNullable == that.graphQlIntNonNullable
         && this.graphQlFloatNullable.equals(that.graphQlFloatNullable)
         && Double.doubleToLongBits(this.graphQlFloatNonNullable) == Double.doubleToLongBits(that.graphQlFloatNonNullable)
         && this.graphQlBooleanNullable.equals(that.graphQlBooleanNullable)
         && this.graphQlBooleanNonNullable == that.graphQlBooleanNonNullable
         && this.graphQlListOfInt.equals(that.graphQlListOfInt)
         && this.graphQlListOfObjects.equals(that.graphQlListOfObjects);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= graphQlString.hashCode();
        h *= 1000003;
        h ^= graphQlIdNullable.hashCode();
        h *= 1000003;
        h ^= graphQlIdNonNullable.hashCode();
        h *= 1000003;
        h ^= graphQlIntNullable.hashCode();
        h *= 1000003;
        h ^= graphQlIntNonNullable;
        h *= 1000003;
        h ^= graphQlFloatNullable.hashCode();
        h *= 1000003;
        h ^= Double.valueOf(graphQlFloatNonNullable).hashCode();
        h *= 1000003;
        h ^= graphQlBooleanNullable.hashCode();
        h *= 1000003;
        h ^= Boolean.valueOf(graphQlBooleanNonNullable).hashCode();
        h *= 1000003;
        h ^= graphQlListOfInt.hashCode();
        h *= 1000003;
        h ^= graphQlListOfObjects.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final GraphQlListOfObject.Mapper graphQlListOfObjectFieldMapper = new GraphQlListOfObject.Mapper();

      final Field[] fields = {
        Field.forString("graphQlString", "graphQlString", null, true),
        Field.forString("graphQlIdNullable", "graphQlIdNullable", null, true),
        Field.forString("graphQlIdNonNullable", "graphQlIdNonNullable", null, false),
        Field.forInt("graphQlIntNullable", "graphQlIntNullable", null, true),
        Field.forInt("graphQlIntNonNullable", "graphQlIntNonNullable", null, false),
        Field.forDouble("graphQlFloatNullable", "graphQlFloatNullable", null, true),
        Field.forDouble("graphQlFloatNonNullable", "graphQlFloatNonNullable", null, false),
        Field.forBoolean("graphQlBooleanNullable", "graphQlBooleanNullable", null, true),
        Field.forBoolean("graphQlBooleanNonNullable", "graphQlBooleanNonNullable", null, false),
        Field.forScalarList("graphQlListOfInt", "graphQlListOfInt", null, true),
        Field.forObjectList("graphQlListOfObjects", "graphQlListOfObjects", null, true)
      };

      @Override
      public Data map(ResponseReader reader) throws IOException {
        final String graphQlString = reader.readString(fields[0]);
        final String graphQlIdNullable = reader.readString(fields[1]);
        final String graphQlIdNonNullable = reader.readString(fields[2]);
        final Integer graphQlIntNullable = reader.readInt(fields[3]);
        final int graphQlIntNonNullable = reader.readInt(fields[4]);
        final Double graphQlFloatNullable = reader.readDouble(fields[5]);
        final double graphQlFloatNonNullable = reader.readDouble(fields[6]);
        final Boolean graphQlBooleanNullable = reader.readBoolean(fields[7]);
        final boolean graphQlBooleanNonNullable = reader.readBoolean(fields[8]);
        final List<Integer> graphQlListOfInt = reader.readList(fields[9], new ResponseReader.ListReader<Integer>() {
          @Override
          public Integer read(ResponseReader.ListItemReader reader) throws IOException {
            return reader.readInt();
          }
        });
        final List<GraphQlListOfObject> graphQlListOfObjects = reader.readList(fields[10], new ResponseReader.ListReader<GraphQlListOfObject>() {
          @Override
          public GraphQlListOfObject read(ResponseReader.ListItemReader reader) throws IOException {
            return reader.readObject(new ResponseReader.ObjectReader<GraphQlListOfObject>() {
              @Override
              public GraphQlListOfObject read(ResponseReader reader) throws IOException {
                return graphQlListOfObjectFieldMapper.map(reader);
              }
            });
          }
        });
        return new Data(graphQlString, graphQlIdNullable, graphQlIdNonNullable, graphQlIntNullable, graphQlIntNonNullable, graphQlFloatNullable, graphQlFloatNonNullable, graphQlBooleanNullable, graphQlBooleanNonNullable, graphQlListOfInt, graphQlListOfObjects);
      }
    }
  }

  public static class GraphQlListOfObject {
    private final int someField;

    private volatile String $toString;

    private volatile int $hashCode;

    private volatile boolean $hashCodeMemoized;

    public GraphQlListOfObject(int someField) {
      this.someField = someField;
    }

    public int someField() {
      return this.someField;
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "GraphQlListOfObject{"
          + "someField=" + someField
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof GraphQlListOfObject) {
        GraphQlListOfObject that = (GraphQlListOfObject) o;
        return this.someField == that.someField;
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= someField;
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<GraphQlListOfObject> {
      final Field[] fields = {
        Field.forInt("someField", "someField", null, false)
      };

      @Override
      public GraphQlListOfObject map(ResponseReader reader) throws IOException {
        final int someField = reader.readInt(fields[0]);
        return new GraphQlListOfObject(someField);
      }
    }
  }
}
