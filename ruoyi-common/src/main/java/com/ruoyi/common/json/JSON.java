package com.ruoyi.common.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * JSON解析处理
 * 
 * @author ruoyi
 */
public class JSON
{
    public static final String DEFAULT_FAIL = "\"Parse failed\"";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();

    public static void marshal(File file, Object value) throws Exception
    {
        try
        {
            objectWriter.writeValue(file, value);
        }
        catch (JsonGenerationException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static void marshal(OutputStream os, Object value) throws Exception
    {
        try
        {
            objectWriter.writeValue(os, value);
        }
        catch (JsonGenerationException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static String marshal(Object value) throws Exception
    {
        try
        {
            return objectWriter.writeValueAsString(value);
        }
        catch (JsonGenerationException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static byte[] marshalBytes(Object value) throws Exception
    {
        try
        {
            return objectWriter.writeValueAsBytes(value);
        }
        catch (JsonGenerationException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static <T> T unmarshal(File file, Class<T> valueType) throws Exception
    {
        try
        {
            return objectMapper.readValue(file, valueType);
        }
        catch (JsonParseException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static <T> T unmarshal(InputStream is, Class<T> valueType) throws Exception
    {
        try
        {
            return objectMapper.readValue(is, valueType);
        }
        catch (JsonParseException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static <T> T unmarshal(String str, Class<T> valueType) throws Exception
    {
        try
        {
            return objectMapper.readValue(str, valueType);
        }
        catch (JsonParseException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    public static <T> T unmarshal(byte[] bytes, Class<T> valueType) throws Exception
    {
        try
        {
            if (bytes == null)
            {
                bytes = new byte[0];
            }
            return objectMapper.readValue(bytes, 0, bytes.length, valueType);
        }
        catch (JsonParseException e)
        {
            throw new Exception(e);
        }
        catch (JsonMappingException e)
        {
            throw new Exception(e);
        }
        catch (IOException e)
        {
            throw new Exception(e);
        }
    }

    static class Person{
        private String name;
        private Integer age;

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setAge(1);
        p.setName("haha");
        String a = JSON.marshal(p);
        System.out.println(a);

        Person pp = JSON.unmarshal(a, Person.class);
        System.out.println(pp);
    }
}
